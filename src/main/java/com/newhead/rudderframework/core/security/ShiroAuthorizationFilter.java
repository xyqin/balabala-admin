package com.newhead.rudderframework.core.security;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by ling on 2017/4/7.
 */
public class ShiroAuthorizationFilter extends AuthorizationFilter {

    /**
     *
     * @return
     */
    @Override
    public String getUnauthorizedUrl() {
        return "/security/login-failed";
    }

    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
            throws IOException {
        Subject subject = getSubject(request, response);
        if (subject.hasRole(Role.SYSADMIN)) { // sysadmin拥有一切权限
            return true;
        }
        String[] rolesArray = (String[]) mappedValue;

        if (rolesArray == null || rolesArray.length == 0) {
            return false;
        }

        for (String aRolesArray : rolesArray) {
            if (subject.hasRole(aRolesArray)) {
                return true;
            }
        }
        return true;
    }

    public String getLoginUrl() {
        return "";
    }


}
