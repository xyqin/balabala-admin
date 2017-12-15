package com.newhead.rudderframework.tools.generator.v1.admin;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;

import java.io.*;
import java.util.List;
import java.util.Map;

public abstract class AbstractJavaBuilder extends AbstractBuilder {
    @Override
    protected String getTemplatePath() {
        return "template/rudderframework";
    }

    @Override
    public void toBuild(List<Project> projects) throws IOException {
        for(Project project:projects) {
            List<Module> modules = project.getModules();
            for (Module m: modules) {
                Map<String,String> params = Maps.newHashMap();
                params.put("key",m.getKey());
                params.put("smoduleName",m.getSmoduleName());
                params.put("bmoduleName",m.getBmoduleName());
                String outfile = TemplateGenerator.adminTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
                togen(outfile,m,this.getClass().getSimpleName());
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
