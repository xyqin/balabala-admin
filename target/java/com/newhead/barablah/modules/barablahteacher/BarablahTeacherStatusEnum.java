package com.newhead.barablah.modules.BarablahTeacher;

/**
 *
 */
public enum BarablahTeacherStatusEnum {
审核中("IN_REVIEW"),审核被拒("REJECTED"),启用("ENABLED"),禁用("DISABLED");
    private String value;

    private BarablahTeacherStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahTeacherStatusEnum[] enums = BarablahTeacherStatusEnum.values();
        for(BarablahTeacherStatusEnum e:enums) {
            if (e.getValue().equals(value)) {
                return  e.name();
            }
        }
        return "";
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}