package com.newhead.balabala.modules.BalabalaMemberHomework;

/**
 *
 */
public enum BalabalaMemberHomeworkStatusEnum {
未完成("PENDING"),已完成("FINISHED");
    private String value;

    private BalabalaMemberHomeworkStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaMemberHomeworkStatusEnum[] enums = BalabalaMemberHomeworkStatusEnum.values();
        for(BalabalaMemberHomeworkStatusEnum e:enums) {
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
