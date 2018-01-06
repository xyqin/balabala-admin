package com.newhead.balabala.modules.BalabalaMemberPointLog;

/**
 *
 */
public enum BalabalaMemberPointLogTypeEnum {
奖杯("TROPHY"),鼓掌("CLAPPING"),开心("SMILING");
    private String value;

    private BalabalaMemberPointLogTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaMemberPointLogTypeEnum[] enums = BalabalaMemberPointLogTypeEnum.values();
        for(BalabalaMemberPointLogTypeEnum e:enums) {
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
