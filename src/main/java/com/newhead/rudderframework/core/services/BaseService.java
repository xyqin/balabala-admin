package com.newhead.rudderframework.core.services;

import com.newhead.rudderframework.core.security.ShiroAuthorizingRealm;

/**
 * Created by ling on 2017/5/11.
 */
public class BaseService {
    /**
     * 获得当前用户
     * @return
     */
    public ShiroAuthorizingRealm.ShiroUser getCurrentUser() {
        return new ShiroAuthorizingRealm.ShiroUser();
    }
}
