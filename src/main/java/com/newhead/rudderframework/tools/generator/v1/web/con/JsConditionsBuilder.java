package com.newhead.rudderframework.tools.generator.v1.web.con;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.*;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;
import com.newhead.rudderframework.tools.generator.v1.web.forms.FormItem;
import org.springframework.beans.BeanUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/25.
 */
public class JsConditionsBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return "${smoduleName}/conditions/${bmoduleName}Conditions.js";
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
                ConditionsTemplateVo ctv = new ConditionsTemplateVo();
                ctv.setName(module.getBmoduleName().toUpperCase());

                List<BaseField> fields = module.getQueryfields();
                for (BaseField field:fields) {
                    FormItem formItem = new FormItem();
                    if (field.getFieldType().equals("Object")) {
                        ObjectField of = (ObjectField)field;
                        String url = "";
                        BeanUtils.copyProperties(of,formItem);
                        if (of.getRef().getType()==null || of.getRef().getType().equals("SingleList")) {
                            url = "/"+of.getRef().getModule().toLowerCase()+"/getlist";
                        } else if (of.getRef().getType().equals("SingleTree")) {
                            url ="/"+ of.getRef().getModule().toLowerCase()+"/gettree";
                        }
                        formItem.setDataLableKey(of.getRef().getField());
                        formItem.setDataValueKey("id");
                        formItem.setDisplayType(of.getRef().getType());
                        formItem.setUrl(url);
                    } else if (field.getFieldType().equals("Enum")) {
                        EnumField ef = (EnumField)field;
                        BeanUtils.copyProperties(ef,formItem);
                    } else if (field.getFieldType().equals("Date")) {
                        BeanUtils.copyProperties(field,formItem);
                    } else  {
                        BeanUtils.copyProperties(field,formItem);
                    }
                    ctv.addField(formItem);
                }

                //输出
                Map<String,String> params = Maps.newHashMap();
                params.put("bmoduleName",module.getBmoduleName());
                params.put("smoduleName",module.getSmoduleName());

                String outfile = TemplateGenerator.webTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
                togen(outfile,ctv,"model.conditions");
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
