package com.newhead.barablah.modules.barablahmembercomment;

/**
 *
 */
public enum BarablahMemberCommentCommentTypeEnum {
班级评论("1"),作业评论("2");
    private String value;

    private BarablahMemberCommentCommentTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BarablahMemberCommentCommentTypeEnum[] enums = BarablahMemberCommentCommentTypeEnum.values();
        for(BarablahMemberCommentCommentTypeEnum e:enums) {
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
