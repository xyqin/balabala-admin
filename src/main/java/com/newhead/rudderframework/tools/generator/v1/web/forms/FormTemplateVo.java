package com.newhead.rudderframework.tools.generator.v1.web.forms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ling on 2017/3/31.
 */
public class FormTemplateVo {
    private String name;

    private List<FormItem> fields = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FormItem> getFields() {
        return fields;
    }

    public void setFields(List<FormItem> fields) {
        this.fields = fields;
    }

    public void addField(FormItem field) {
        this.getFields().add(field);
    }

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        return sdf.format(new Date());
    }

}
