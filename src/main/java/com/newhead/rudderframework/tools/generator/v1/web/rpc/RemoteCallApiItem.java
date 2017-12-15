package com.newhead.rudderframework.tools.generator.v1.web.rpc;

import com.newhead.rudderframework.tools.generator.fields.BaseField;
import com.newhead.rudderframework.tools.generator.fields.BaseTemplateVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/5/1.
 */
public class RemoteCallApiItem  extends BaseTemplateVO {
    private String name;

    private String url;

    private String desc;

    private String method;

    private List<BaseField> fields = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<BaseField> getFields() {
        return fields;
    }

    public void setFields(List<BaseField> fields) {
        this.fields = fields;
    }
}
