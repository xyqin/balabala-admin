package com.newhead.rudderframework.tools.generator.v1.web.rpc;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.utils.StringUtils;
import com.newhead.rudderframework.core.web.component.KeyValue;
import com.newhead.rudderframework.tools.generator.TemplateGenerator;
import com.newhead.rudderframework.tools.generator.fields.BaseField;
import com.newhead.rudderframework.tools.generator.fields.Module;
import com.newhead.rudderframework.tools.generator.fields.Project;
import com.newhead.rudderframework.tools.generator.v1.AbstractBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/25.
 */
public class RpcBuilder extends AbstractBuilder {
    @Override
    protected String getOutpath() {
        return TemplateGenerator.webTargetPath+"${smoduleName}/reqs/${bmoduleName}${bkey}.js";
    }

    @Override
    protected String getTemplatePath() {
        return "template/rudderframework/web";
    }

    public Map<String,String> templateMap  = new HashMap<String,String>();

    @Override
    public void toBuild(List<Project> projectList) throws IOException {
        for(Project project:projectList) {
            List<Module> modules = project.getModules();
            for(Module module:modules) {
                toGen(module);
            }
        }
    }

    @Override
    protected boolean isOverride() {
        return true;
    }

    /**
     *
     * @param fields
     */
    private void fillPageField(List<BaseField> fields) {
        BaseField field = new BaseField();
        field.setName("page");
        field.setDesc("页码");
        fields.add(field);

        BaseField field1 = new BaseField();
        field1.setName("size");
        field1.setDesc("页的大小");
        fields.add(field1);
    }

    /**
     *
     * @param module
     * @throws IOException
     */
    private void toGen(Module module) throws IOException {
        PpcMethodEnum[] methods = PpcMethodEnum.values();
        List<KeyValue> keyvalues = new ArrayList<>();
        for(PpcMethodEnum method:methods) {
            if (method.name().equals("getrnref")) {
                continue;
            }
            RemoteCallApiItem api = new RemoteCallApiItem();
            api.setMethod(method.getRequestMethod());
            api.setName(module.getBmoduleName()+ StringUtils.captureName(method.name()+"Req"));
            api.setUrl(module.getSmoduleName()+"/"+method.name());
            api.setDesc(PpcMethodEnum.getDesc(method.name())+ module.getRemark());
            if (method.getParameType().equals(RpcParamesTypeEnum.IdPath.name())) {
                api.setUrl(api.getUrl()+"/:id");
            } else if (method.getParameType().equals(RpcParamesTypeEnum.UrlParame.name())) {
                api.setFields(module.getQueryfields());
            } else if (method.getParameType().equals(RpcParamesTypeEnum.UrlParameAtPage.name())) {
                List<BaseField> fields = module.getQueryfields();
                fillPageField(fields);
                api.setFields(fields);
            } else if (method.getParameType().equals(RpcParamesTypeEnum.Entity.name())) {
                List<BaseField> fields = module.getFields();
                List<BaseField> targetFields = new ArrayList<>();
                for (BaseField field:fields) {
                    if (field.isVisible()) {
                        targetFields.add(field);
                    }
                }
                api.setFields(targetFields);
            }

            //输出文件
            Map<String,String> params = Maps.newHashMap();
            params.put("smoduleName",module.getSmoduleName());
            params.put("bmoduleName",module.getBmoduleName());
            params.put("bkey",StringUtils.captureName(method.name())+"Req");

            String outfile = TemplateGenerator.generatorTxt(getOutpath(),params);
            togen(outfile,api,"reqs.interface");

            keyvalues.add(new KeyValue(StringUtils.captureName(method.name())+"Req",module.getBmoduleName()+StringUtils.captureName(method.name())+"Req"));
        }

        RPCMainVo mainVo = new RPCMainVo();
        mainVo.setItems(keyvalues);

        Map<String,String> params = Maps.newHashMap();
        params.put("smoduleName",module.getSmoduleName());
        params.put("bmoduleName",module.getBmoduleName());
        params.put("bkey","Curds");

        String outfile = TemplateGenerator.generatorTxt(getOutpath(),params);
        togen(outfile,mainVo,"reqs.main");
    }
}
