package com.newhead.rudderframework.core.security;

/**
 * @author Leo
 */
public enum EnumUserError {
    认证失败(2001, "Authentication failed."), 验证码不正确(2002, "Captcha authentication failed."), 相同登录名的用户已存在(2101,
            "User with same login name exists.");

    EnumUserError(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int code;
    public String msg;
}
