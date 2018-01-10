package com.newhead.rudderframework.core.security;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.modules.rudderuser.ext.SimpleRudderUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.web.filter.authc.PassThruAuthenticationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Map;

/**
 * @author Leo
 */
@Configuration
public class ShiroConfig implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Bean
    public ShiroAuthorizingRealm shiroDbRealm() {
        ShiroAuthorizingRealm realm = new ShiroAuthorizingRealm();
        realm.setUserService(ctx.getBean(SimpleRudderUserService.class));
        return realm;
    }

    @Bean
    public EhCacheManager shiroEhcacheManager() {
        EhCacheManager manager = new EhCacheManager();
        manager.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
        return manager;
    }

    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(ctx.getBean(ShiroAuthorizingRealm.class));
        manager.setCacheManager(ctx.getBean(EhCacheManager.class));
        SecurityUtils.setSecurityManager(manager);
        return manager;
    }

    @Bean
    public ShiroFilterChainDefinitions shiroFilter() {
        ShiroFilterChainDefinitions filter = new ShiroFilterChainDefinitions();
        filter.setSecurityManager(ctx.getBean(DefaultWebSecurityManager.class));
        filter.setLoginUrl("/security/login-failed");
        filter.setUnauthorizedUrl("/security/access-denied");

        // 在这里定义has-any-of-roles，是为了确保path们的顺序
        filter.setFilterChainDefinitions("/ruddermenu/** = authc\n" +
                "/rudderuser/** = authc\n" +
                "/rudderrole/** = authc\n" +
                "/rudderpermission/** = authc\n"
        );

        Map<String, Filter> filters = Maps.newLinkedHashMap();
        filters.put("authc", new PassThruAuthenticationFilter());
        filters.put("has-any-of-roles", new ShiroAuthorizationFilter());
        filter.setFilters(filters);

        return filter;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
