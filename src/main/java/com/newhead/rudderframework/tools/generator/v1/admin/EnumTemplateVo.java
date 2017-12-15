package com.newhead.rudderframework.tools.generator.v1.admin;

import com.newhead.rudderframework.tools.generator.fields.EnumItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ling on 2017/4/27.
 */
public class EnumTemplateVo {
    private String projectName;

    private String moduleName;

    private String enumName;

    private List<EnumItem> types = new ArrayList<>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getEnumName() {
        return enumName;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public List<EnumItem> getTypes() {
        return types;
    }

    public void setTypes(List<EnumItem> types) {
        this.types = types;
    }
}
