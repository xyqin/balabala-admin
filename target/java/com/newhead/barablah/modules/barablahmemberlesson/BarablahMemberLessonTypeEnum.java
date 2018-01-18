package com.newhead.barablah.modules.BarablahMemberLesson;

/**
 *
 */
public enum BarablahMemberLessonTypeEnum {
线上("ONLINE"),线下("OFFLINE");
    private String value;

    private BarablahMemberLessonTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahMemberLessonTypeEnum[] enums = BarablahMemberLessonTypeEnum.values();
        for(BarablahMemberLessonTypeEnum e:enums) {
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
