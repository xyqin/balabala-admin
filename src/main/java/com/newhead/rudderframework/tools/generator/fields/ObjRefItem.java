package com.newhead.rudderframework.tools.generator.fields;

import com.newhead.rudderframework.core.utils.StringUtils;

/**
 * Created by ling on 2017/4/21.
 */
public class ObjRefItem {
    private String module;

    private String field;

    private String type;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBmodule() {
        return StringUtils.captureName(this.module);
    }

    public String getSmodule() {
        return this.module.toLowerCase();
    }

    public String getBfield() {
        return StringUtils.captureName(getField());
    }
}
