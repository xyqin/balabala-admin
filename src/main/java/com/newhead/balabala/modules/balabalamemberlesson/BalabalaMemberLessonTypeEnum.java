package com.newhead.balabala.modules.balabalamemberlesson;

/**
 *
 */
public enum BalabalaMemberLessonTypeEnum {
线上("ONLINE"),线下("OFFLINE");
    private String value;

    private BalabalaMemberLessonTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaMemberLessonTypeEnum[] enums = BalabalaMemberLessonTypeEnum.values();
        for(BalabalaMemberLessonTypeEnum e:enums) {
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
