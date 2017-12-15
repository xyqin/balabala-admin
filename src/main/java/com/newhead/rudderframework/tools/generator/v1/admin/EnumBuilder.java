package com.newhead.rudderframework.tools.generator.v1.admin;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/25.
 */
public class EnumBuilder extends AbstractJavaBuilder {
    @Override
    protected String getOutpath() {
        return "com/newhead/${key}/modules/${smoduleName}/${enumName}Enum.java";
    }

    @Override
    public void toBuild(List<Project> projects) throws IOException {
        for(Project project:projects) {
            List<Module> modules = project.getModules();
            for (Module m: modules) {
                for(BaseField field:m.getFields()) {
                    if (field.getFieldType().equals(FieldTypeEnum.Enum.name())) {
                        EnumField ef = (EnumField)field;
                        EnumTemplateVo vo = new EnumTemplateVo();
                        vo.setProjectName(project.getName());
                        vo.setModuleName(m.getBmoduleName());
                        vo.setEnumName(m.getBmoduleName()+field.getBname());
                        vo.setTypes(ef.getTypes());
                        List<EnumItem> types = vo.getTypes();
                        for(EnumItem item:types) {
                            item.setLabel(item.getLabel().trim());
                        }
                        Map<String,String> params = Maps.newHashMap();
                        params.put("key",m.getKey());
                        params.put("smoduleName",m.getSmoduleName());
                        params.put("enumName",vo.getEnumName());
                        String outfile = TemplateGenerator.adminTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
                        togen(outfile,vo,"EnumBuilder");
                    }
                }
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
