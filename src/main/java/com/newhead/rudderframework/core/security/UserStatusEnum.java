package com.newhead.rudderframework.core.security;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by ling on 2017/4/8.
 */
public enum  UserStatusEnum {
    NORMAL("1", "正常"), LOCKED("2", "登录锁定"), DISABLED("3", "禁用");

    private UserStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code() {
        return code;
    }

    public String msg() {
        return msg;
    }

    public static String json() {
        UserStatusEnum[] values = values();
        String[] json = new String[values.length];
        for (int i = 0; i < json.length; i++) {
            json[i] = "\"" + values[i].code + "\":\"" + values[i].msg + "\"";
        }
        return "{" + StringUtils.join(json, ",") + "}";
    }

    private String code;
    private String msg;
}
