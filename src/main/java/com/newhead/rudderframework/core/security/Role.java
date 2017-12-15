package com.newhead.rudderframework.core.security;

/**
 * Created by ling on 2017/4/7.
 */
public interface Role {
    public final String SYSADMIN = "sysadmin";
    public Long getId();

    public String getName();
}
