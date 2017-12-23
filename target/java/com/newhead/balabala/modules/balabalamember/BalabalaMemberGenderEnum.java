package com.newhead.balabala.modules.BalabalaMember;

/**
 *
 */
public enum BalabalaMemberGenderEnum {
男("MALE"),女("FEMALE");
    private String value;

    private BalabalaMemberGenderEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        BalabalaMemberGenderEnum[] enums = BalabalaMemberGenderEnum.values();
        for(BalabalaMemberGenderEnum e:enums) {
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
