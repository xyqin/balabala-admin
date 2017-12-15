package com.newhead.rudderframework.tools.generator.fields;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/24.
 */
public class RefObjField extends BaseField {
    private List<IdRefItem> refs = new ArrayList<>();

    public List<IdRefItem> getRefs() {
        return refs;
    }

    public void setRefs(List<IdRefItem> refs) {
        this.refs = refs;
    }

    @Override
    public String getFieldType() {
        return FieldTypeEnum.RefObj.name();
    }
}
