package com.newhead.balabala.modules.balabalaclass;

/**
 *
 */
public enum BalabalaClassStatusEnum {
审核中("IN_REVIEW"),审核被拒("REJECTED"),进行中("ONGOING"),已结束("FINISHED");
    private String value;

    private BalabalaClassStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaClassStatusEnum[] enums = BalabalaClassStatusEnum.values();
        for(BalabalaClassStatusEnum e:enums) {
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
