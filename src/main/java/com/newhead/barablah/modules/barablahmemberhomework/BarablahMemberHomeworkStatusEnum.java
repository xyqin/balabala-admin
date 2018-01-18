package com.newhead.barablah.modules.barablahmemberhomework;

/**
 *
 */
public enum BarablahMemberHomeworkStatusEnum {
未完成("PENDING"),已完成("FINISHED");
    private String value;

    private BarablahMemberHomeworkStatusEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahMemberHomeworkStatusEnum[] enums = BarablahMemberHomeworkStatusEnum.values();
        for(BarablahMemberHomeworkStatusEnum e:enums) {
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
