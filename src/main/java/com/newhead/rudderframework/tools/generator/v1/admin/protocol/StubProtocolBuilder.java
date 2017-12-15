package com.newhead.rudderframework.tools.generator.v1.admin.protocol;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.v1.admin.AbstractJavaBuilder;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/5/3.
 */
public class StubProtocolBuilder extends AbstractJavaBuilder {
    private String[] protocolPath = new String[]{
            "Abstract${name}CreateRequest",
            "Abstract${name}GetDetailResponse",
            "Abstract${name}QueryListRequest",
            "Abstract${name}QueryPageRequest",
            "Abstract${name}QueryResponse",
            "Abstract${name}UpdateRequest"
    };
    @Override
    protected String getOutpath() {
        return "com/newhead/${key}/modules/${smoduleName}/${protocolPath}/protocol/${protocolName}.java";
    }

    @Override
    protected String getTemplatePath() {
        return "template/rudderframework/protocol";
    }

    @Override
    protected boolean isOverride() {
        return true;
    }

    @Override
    public void toBuild(List<Project> projects) throws IOException {
        for(Project project:projects) {
            List<Module> modules = project.getModules();
            for (Module m: modules) {
                genProtocolClass(m);
            }
        }
    }

    private void genProtocolClass(Module module) throws IOException {
        for(String path:protocolPath) {
            Map<String,String> params = Maps.newHashMap();
            params.put("key",module.getKey());
            params.put("smoduleName",module.getSmoduleName());
            params.put("protocolPath","base");

            Map<String,String> names = Maps.newHashMap();
            names.put("name",module.getBmoduleName());

            params.put("protocolName",TemplateGenerator.generatorTxt(path,names));

            String outfile = TemplateGenerator.adminTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
            names.put("name","");
            togen(outfile,module,TemplateGenerator.generatorTxt(path,names));
        }
    }
}
