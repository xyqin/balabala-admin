package com.newhead.rudderframework.tools.generator.fields;

/**
 * Created by ling on 2017/4/24.
 */
public class ObjectField extends BaseField {
    private ObjRefItem ref = new ObjRefItem();

    @Override
    public String getFieldType() {
        return FieldTypeEnum.Object.name();
    }

    public ObjRefItem getRef() {
        return ref;
    }

    public void setRef(ObjRefItem ref) {
        this.ref = ref;
    }
}
