package com.newhead.rudderframework.tools.generator.v1.web.forms;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.*;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;
import org.springframework.beans.BeanUtils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/25.
 */
public class FormBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return "${smoduleName}/forms/${bmoduleName}FormFields.js";
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
                FormTemplateVo ctv = new FormTemplateVo();
                ctv.setName(module.getBmoduleName().toUpperCase());

                for (BaseField field:module.getFields()) {
                    if (!field.isVisible()) continue;
                    if (field.getViewconfig()!=null) {
                        if (field.getViewconfig().getOptype().equals("0") || field.getViewconfig().getOptype().equals("")) {
                            continue;
                        }
                    }

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
                    } else {
                        BeanUtils.copyProperties(field,formItem);

                    }
                    ctv.addField(formItem);
                }

                for(IdRefItem item:module.getRefs()) {
                    FormItem formItem = new FormItem();
                    formItem.setName(item.getRnref()+"s");
                    formItem.setDesc(item.getRemark());
                    formItem.setDisplayType(item.getDisplayType());
                    formItem.setFieldType("Object");
                    if (item.getDisplayType().equals("ListSelect")) {
                        formItem.setUrl("/"+item.getRnref().toLowerCase()+"/getlist");
                    } else {
                        formItem.setUrl("/"+item.getRnref().toLowerCase()+"/gettree");

                    }
                    formItem.setDataLableKey(item.getRnname());
                    formItem.setDataValueKey("id");
                    ctv.addField(formItem);
                }

                //输出
                Map<String,String> params = Maps.newHashMap();
                params.put("bmoduleName",module.getBmoduleName());
                params.put("smoduleName",module.getSmoduleName());

                String outfile = TemplateGenerator.webTargetPath + TemplateGenerator.generatorTxt(getOutpath(),params);
                togen(outfile,ctv,"model.form");
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }
}
