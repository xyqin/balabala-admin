package com.newhead.rudderframework.tools.generator.v1.web.columns;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.*;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/25.
 */
public class JsColumnBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return "${smoduleName}/columns/${bmoduleName}Columns.js";
    }

    @Override
    protected String getTemplatePath() {
        return "template/rudderframework/web";
    }

    @Override
    public void toBuild(List<Project> projectList) throws IOException {
        for(Project project:projectList) {
            List<Module> modules = project.getModules();
            for(Module module:modules) {
                ColumnsTemplateVo ctv = new ColumnsTemplateVo();
                ctv.setName(module.getBmoduleName().toUpperCase());
                for (BaseField field:module.getFields()) {
                    if (!field.isVisible()) continue;
                    if (field.getViewconfig()!=null) {
                        if (field.getViewconfig().getOptype().equals("0") || field.getViewconfig().getOptype().equals("")) {
                            continue;
                        }
                    }
                    if (field.getFieldType().equals(FieldTypeEnum.Object.name())) {
                        ctv.addField(new ColumnItem(field.getName()+ "Object",field.getDesc(),field.getFieldType(),true));
                    } else if (field.getFieldType().equals(FieldTypeEnum.Enum.name())) {
                        ctv.addField(new ColumnItem(field.getName()+ "Enum",field.getDesc(),field.getFieldType(),true));
                    } else {
                        ctv.addField(new ColumnItem(field.getName(),field.getDesc(),field.getFieldType(),true));
                    }
                }
                //输出
                Map<String,String> params = Maps.newHashMap();
                params.put("bmoduleName",module.getBmoduleName());
                params.put("smoduleName",module.getSmoduleName());

                String outfile = TemplateGenerator.webTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
                togen(outfile,ctv,"model.columns");
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
