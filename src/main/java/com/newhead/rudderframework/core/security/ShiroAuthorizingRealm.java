package com.newhead.rudderframework.core.security;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.newhead.rudderframework.core.utils.EncodeUtil;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.ext.SimpleRudderUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by ling on 2017/4/7.
 */
public class ShiroAuthorizingRealm extends AuthorizingRealm {

    protected SimpleRudderUserService userService;

    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        RudderUser user = userService.getActiveUserByLoginName(token.getUsername());
        if (user != null) {
            byte[] salt = EncodeUtil.decodeHex(user.getSalt());
            ShiroUser pricipal = new ShiroUser(user.getId(), user.getRudderuserName(), user.getNickname(),
                    user.getEmail(), user.getStatus(), user.getCreatedAt(), userService.isSysadmin(user.getId()));
            return new SimpleAuthenticationInfo(pricipal, user.getPassword(), ByteSource.Util.bytes(salt), getName());
        } else {
            return null;
        }
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();
        RudderUser user = userService.getActiveUserByLoginName(shiroUser.loginName);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<String> roles = Lists.newArrayList();
        userService.getRudderRoles(user.getId()).forEach(role -> roles.add(role.getValue()));
        info.addRoles(roles);
        return info;
    }


    /**
     * 设定Password校验的Hash算法与迭代次数.
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(SimpleRudderUserService.HASH_ALGORITHM);
        matcher.setHashIterations(SimpleRudderUserService.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
    }

    public void setUserService(SimpleRudderUserService userService) {
        this.userService = userService;
    }

    /**
     * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
     */
    public static class ShiroUser implements Serializable {
        private static final long serialVersionUID = -1373760761780840081L;
        public Long id = 0l;
        public String loginName;
        public String name;
        public String email;
        public String status;
        public Date createdAt;
        public boolean isSysadmin;

        public ShiroUser() {

        }
        public ShiroUser(Long id, String loginName, String name, String email, String status, Date createdAt, boolean isSysadmin) {
            this.id = id;
            this.loginName = loginName;
            this.name = name;
            this.email = email;
            this.status = status;
            this.createdAt = createdAt;
            this.isSysadmin = isSysadmin;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        /**
         * 本函数输出将作为默认的<shiro:principal/>输出.
         */
        @Override
        public String toString() {
            return loginName;
        }

        /**
         * 重载hashCode,只计算loginName;
         */
        @Override
        public int hashCode() {
            return Objects.hashCode(loginName);
        }

        /**
         * 重载equals,只计算loginName;
         */
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ShiroUser other = (ShiroUser) obj;
            if (loginName == null) {
                if (other.loginName != null) {
                    return false;
                }
            } else if (!loginName.equals(other.loginName)) {
                return false;
            }
            return true;
        }
    }
}
