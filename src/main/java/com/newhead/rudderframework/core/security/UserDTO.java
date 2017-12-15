package com.newhead.rudderframework.core.security;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ling on 2017/4/7.
 */
public class UserDTO {
    private Long id;
    private String loginName;
    private String name;
    private String email;
    private int status;
    private Date loginTime;
    private boolean sysadmin;

    private String accessToken;

    private List<RoleDTO> roles = new ArrayList<>();

//    public UserDTO(ShiroUser user) {
//        BeanUtils.copyProperties(user,this);
//    }

    public Long getId() {
        return id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public boolean isSysadmin() {
        return sysadmin;
    }

    public List<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDTO> roles) {
        this.roles = roles;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setSysadmin(boolean sysadmin) {
        this.sysadmin = sysadmin;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
