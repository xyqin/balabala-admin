package com.newhead.balabala.modules.balabalaclassmember;

/**
 *
 */
public enum BalabalaClassMemberStatusEnum {
审核中("IN_REVIEW"),审核被拒("REJECTED"),进行中("ONGOING"),已结束("FINISHED");
    private String value;

    private BalabalaClassMemberStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaClassMemberStatusEnum[] enums = BalabalaClassMemberStatusEnum.values();
        for(BalabalaClassMemberStatusEnum e:enums) {
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
