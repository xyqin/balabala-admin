package com.newhead.sc.modules.scdevice;

/**
 *
 */
public enum ScDeviceTypeEnum {
门禁("ACCESS"),视频("CAMERA");
    private String value;

    private ScDeviceTypeEnum(String value) {
        this.value = value;
    }

    public static String getLabel(String value) {
        ScDeviceTypeEnum[] enums = ScDeviceTypeEnum.values();
        for(ScDeviceTypeEnum e:enums) {
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
