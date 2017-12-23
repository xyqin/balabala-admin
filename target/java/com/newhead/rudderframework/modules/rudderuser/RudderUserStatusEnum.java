package com.newhead.rudderframework.modules.RudderUser;

/**
 *
 */
public enum RudderUserStatusEnum {
正常("1"),登录锁定("2"),禁用("3");
    private String value;

    private RudderUserStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        RudderUserStatusEnum[] enums = RudderUserStatusEnum.values();
        for(RudderUserStatusEnum e:enums) {
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
