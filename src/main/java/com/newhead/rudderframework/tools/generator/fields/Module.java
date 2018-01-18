package com.newhead.rudderframework.tools.generator.fields;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.newhead.rudderframework.core.utils.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ling on 2017/4/24.
 */
public class Module extends BaseTemplateVO {
    private String key = "";

    private String moduleName = "";

    private String moduleTitle = "";

    private String remark = "";

    private String version = "1.0";

    private String dataType = DataTypeEnum.Table.name();

    private String displayField = "";

    private List<IdRefItem> refs = new ArrayList<>();

    /**
     * 引用对象
     */
    private List<BaseField> fields = new ArrayList<>();

    public Module() {

    }
    public Module(String key,String moduleName,String moduleTitle) {
        this.key = key;
        this.moduleName = StringUtils.convertNameBy(moduleName);
        this.moduleTitle = moduleTitle;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDisplayField() {
        return displayField;
    }

    public void setDisplayField(String displayField) {
        this.displayField = displayField;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @JsonIgnore
    public String getBmoduleName() {
        if (this.moduleName==null||this.moduleName.equals("")) {
            return "";
        }
        return StringUtils.captureName(this.moduleName);
    }
    @JsonIgnore
    public String getSmoduleName() {
        return getModuleName().toLowerCase();
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

    public List<IdRefItem> getRefs() {
        if (refs==null) {
            refs = new ArrayList<>();
        }
        return refs;
    }

    @JsonIgnore
    public String getBdisplayField() {
        return StringUtils.captureName(this.displayField);
    }

    public void setRefs(List<IdRefItem> refs) {
        this.refs = refs;
    }

    public List<BaseField> getQueryfields() {
        List<BaseField> fields = new ArrayList<>();
        for(BaseField field:getFields()) {
            if (field.getQueryType()>0) {
                fields.add(field);
            }
        }
        return  fields;
    }

    public List<Module> getMappers() {
        Map<String,String> tempMaps = new HashMap<>();
        for(BaseField field:this.getFields()) {
            if (field.getFieldType().equals(FieldTypeEnum.Object.name())) {
                ObjectField of = (ObjectField)field;
                tempMaps.put(of.getRef().getModule(),of.getRef().getField());
            }
        }
        for(IdRefItem item:this.getRefs()) {
            String key = item.getBr2();
            if (!tempMaps.containsKey(key)) {
                tempMaps.put(key,"");
            }
            String key1 = item.getBrnref();
            if (!tempMaps.containsKey(key1)) {
                tempMaps.put(key1,item.getRnname());
            }
        }
        List<Module> results = new ArrayList<>();

        for (String name:tempMaps.keySet()) {
            Module m = new Module();
            if (name.toLowerCase().contains("barablah")) {
                m.setKey("barablah");
            } else {
                m.setKey("rudderframework");
            }
            m.setModuleName(name);
            if (name.toLowerCase().equals(this.getBmoduleName().toLowerCase())) {
                continue;
            }
            results.add(m);
        }
        return results;
    }
}
