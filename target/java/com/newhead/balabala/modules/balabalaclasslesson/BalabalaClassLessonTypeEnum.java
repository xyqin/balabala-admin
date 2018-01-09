package com.newhead.balabala.modules.BalabalaClassLesson;

/**
 *
 */
public enum BalabalaClassLessonTypeEnum {
线上("ONLINE"),线下("OFFLINE");
    private String value;

    private BalabalaClassLessonTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaClassLessonTypeEnum[] enums = BalabalaClassLessonTypeEnum.values();
        for(BalabalaClassLessonTypeEnum e:enums) {
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
