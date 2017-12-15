package com.newhead.rudderframework.tools.generator.v1.web.con;

import com.newhead.rudderframework.tools.generator.fields.BaseField;
import com.newhead.rudderframework.tools.generator.fields.BaseTemplateVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/3/31.
 */
public class ConditionsTemplateVo extends BaseTemplateVO {
    private String name;

    private List<BaseField> fields = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BaseField> getFields() {
        return fields;
    }

    public void setFields(List<BaseField> fields) {
        this.fields = fields;
    }

    public void addField(BaseField field) {
        this.getFields().add(field);
    }
}
