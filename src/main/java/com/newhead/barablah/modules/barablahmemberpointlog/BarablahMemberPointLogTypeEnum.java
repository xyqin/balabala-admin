package com.newhead.barablah.modules.barablahmemberpointlog;

/**
 *
 */
public enum BarablahMemberPointLogTypeEnum {
奖杯("TROPHY"),鼓掌("CLAPPING"),开心("SMILING");
    private String value;

    private BarablahMemberPointLogTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahMemberPointLogTypeEnum[] enums = BarablahMemberPointLogTypeEnum.values();
        for(BarablahMemberPointLogTypeEnum e:enums) {
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
