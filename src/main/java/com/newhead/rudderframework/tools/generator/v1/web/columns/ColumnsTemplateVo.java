package com.newhead.rudderframework.tools.generator.v1.web.columns;

import com.newhead.rudderframework.tools.generator.fields.BaseTemplateVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/3/31.
 */
public class ColumnsTemplateVo extends BaseTemplateVO {
    private String name;

    private List<ColumnItem> fields = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ColumnItem> getFields() {
        return fields;
    }

    public void setFields(List<ColumnItem> fields) {
        this.fields = fields;
    }

    public void addField(ColumnItem field) {
        this.getFields().add(field);
    }
}
