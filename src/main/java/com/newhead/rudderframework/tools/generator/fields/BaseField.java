package com.newhead.rudderframework.tools.generator.fields;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.newhead.rudderframework.core.utils.StringUtils;

/**
 * Created by ling on 2017/4/24.
 */
public class BaseField extends BaseTemplateVO {

    private ViewConfigItem viewconfig = new ViewConfigItem();
    /**
     * 唯一性校验
     */
    private boolean checkName;

    /**
     * 查询类型
     * @see FieldQueryTypeEnum
     */
    private int queryType = FieldQueryTypeEnum.Nothing.ordinal();

    private String javaType;

    private String name;

    private String desc;

    private boolean visible;

    private int displayOrder;

    private int length;

    private boolean valid;

    private boolean orderkey;

    private String fieldType = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     *
     * @param fieldName
     * @param remarkstr
     * @return
     */
    public static BaseField newBuild(String fieldName, String remarkstr, String javaType) {
        BaseField field = JSON.parseObject(remarkstr,BaseField.class);
        if (field==null) {
            System.out.println("8******************");
            System.out.println(remarkstr);

        }

        if (field.getFieldType().equals(FieldTypeEnum.Object.name())) {
            field = JSON.parseObject(remarkstr,ObjectField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.String.name())) {
            field = JSON.parseObject(remarkstr,StringField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.RefObj.name())) {
            field = JSON.parseObject(remarkstr,RefObjField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Date.name())) {
            field = JSON.parseObject(remarkstr,DateField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Number.name())) {
            field = JSON.parseObject(remarkstr,NumberField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Id.name())) {
            field = JSON.parseObject(remarkstr,IdField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Image.name())) {
            field = JSON.parseObject(remarkstr,ImageField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Enum.name())) {
            field = JSON.parseObject(remarkstr,EnumField.class);
        } else  if (field.getFieldType().equals(FieldTypeEnum.Bool.name())) {
            field = JSON.parseObject(remarkstr,BoolField.class);
        }  else  if (field.getFieldType().equals(FieldTypeEnum.File.name())) {
            field = JSON.parseObject(remarkstr,FileField.class);
        }
        else {
            throw new RuntimeException();
        }
        field.setDesc(field.getName());
        field.setName(fieldName);
        field.setJavaType(javaType);
        return field;
    }

    public boolean isCheckName() {
        return checkName;
    }

    public void setCheckName(boolean checkName) {
        this.checkName = checkName;
    }

    public int getQueryType() {
        return queryType;
    }

    public void setQueryType(int queryType) {
        this.queryType = queryType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    @JsonIgnore
    public String getBname() {
        return StringUtils.captureName(this.getName());
    }

    public ViewConfigItem getViewconfig() {
        return viewconfig;
    }

    public void setViewconfig(ViewConfigItem viewconfig) {
        this.viewconfig = viewconfig;
    }

    public boolean isOrderkey() {
        return orderkey;
    }

    public void setOrderkey(boolean orderkey) {
        this.orderkey = orderkey;
    }
}
