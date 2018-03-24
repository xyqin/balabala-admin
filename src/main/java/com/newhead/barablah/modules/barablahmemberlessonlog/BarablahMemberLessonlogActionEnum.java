package com.newhead.barablah.modules.barablahmemberlessonlog;

/**
 *
 */
public enum BarablahMemberLessonlogActionEnum {
签到("ONLINE"),退出("OFFLINE");
    private String value;

    private BarablahMemberLessonlogActionEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahMemberLessonlogActionEnum[] enums = BarablahMemberLessonlogActionEnum.values();
        for(BarablahMemberLessonlogActionEnum e:enums) {
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
