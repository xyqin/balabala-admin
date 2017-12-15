package com.newhead.rudderframework.tools.generator.v1.web.forms;

import com.newhead.rudderframework.tools.generator.fields.BaseField;
import com.newhead.rudderframework.tools.generator.fields.EnumItem;

import java.util.ArrayList;
import java.util.List;

public class FormItem extends BaseField {
    private String url;

    private String displayType;

    private String dataLableKey;

    private String dataValueKey;

    private List<EnumItem> types = new ArrayList<>();

    public List<EnumItem> getTypes() {
        return types;
    }

    public void setTypes(List<EnumItem> types) {
        this.types = types;
    }

    public FormItem() {

    }

    /**
     * @param label 名称
     * @param value 描述
     * @param url 类型
     */
    public FormItem(String label, String value, String url) {
        this.dataLableKey = label;
        this.dataValueKey = value;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getDataLableKey() {
        return dataLableKey;
    }

    public void setDataLableKey(String dataLableKey) {
        this.dataLableKey = dataLableKey;
    }

    public String getDataValueKey() {
        return dataValueKey;
    }

    public void setDataValueKey(String dataValueKey) {
        this.dataValueKey = dataValueKey;
    }
}
