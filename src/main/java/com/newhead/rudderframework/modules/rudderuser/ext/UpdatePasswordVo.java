package com.newhead.rudderframework.modules.rudderuser.ext;

/**
 * Created by ling on 2017/4/22.
 */
public class UpdatePasswordVo {
    private Long userId;

    private String oldpwd;

    private String newpwd;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOldpwd() {
        return oldpwd;
    }

    public void setOldpwd(String oldpwd) {
        this.oldpwd = oldpwd;
    }

    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }
}
