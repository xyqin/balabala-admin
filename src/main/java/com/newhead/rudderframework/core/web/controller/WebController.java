package com.newhead.rudderframework.core.web.controller;

import com.newhead.rudderframework.core.security.ShiroAuthorizingRealm;
import org.apache.shiro.SecurityUtils;

/**
 *
 */
public class WebController {
    /**
     * 获得当前用户
     * @return
     */
    public ShiroAuthorizingRealm.ShiroUser getCurrentUser() {
        return (ShiroAuthorizingRealm.ShiroUser) SecurityUtils.getSubject().getPrincipal();
        //return new ShiroAuthorizingRealm.ShiroUser();
    }
}
