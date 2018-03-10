package com.newhead.barablah.modules.barablahteacher;

/**
 *
 */
public enum BarablahTeacherStatusEnum {
待审核("IN_REVIEW"),启用("ENABLED"),禁用("DISABLED");
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
