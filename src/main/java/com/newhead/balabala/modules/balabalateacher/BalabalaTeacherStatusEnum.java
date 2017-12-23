package com.newhead.balabala.modules.balabalateacher;

/**
 *
 */
public enum BalabalaTeacherStatusEnum {
审核中("IN_REVIEW"),审核被拒("REJECTED"),启用("ENABLED"),禁用("DISABLED");
    private String value;

    private BalabalaTeacherStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaTeacherStatusEnum[] enums = BalabalaTeacherStatusEnum.values();
        for(BalabalaTeacherStatusEnum e:enums) {
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
