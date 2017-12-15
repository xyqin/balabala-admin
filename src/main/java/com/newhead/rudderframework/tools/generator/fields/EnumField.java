package com.newhead.rudderframework.tools.generator.fields;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/24.
 */
public class EnumField extends BaseField {
    @Override
    public String getFieldType() {
        return FieldTypeEnum.Enum.name();
    }

    private List<EnumItem> types = new ArrayList<>();

    public List<EnumItem> getTypes() {
        return types;
    }

    public void setTypes(List<EnumItem> types) {
        this.types = types;
    }
}
