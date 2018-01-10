package com.newhead.rudderframework.core.security;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.modules.rudderrole2permission.ext.SimpleRudderRole2permissionService;
import com.newhead.rudderframework.modules.rudderuser.ext.SimpleRudderUserService;
import org.apache.shiro.config.ConfigurationException;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.PathConfigProcessor;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.filter.mgt.DefaultFilterChainManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.servlet.Filter;
import java.util.Map;

/**
 * Created by ling on 2017/4/7.
 */
public class ShiroFilterChainDefinitions extends ShiroFilterFactoryBean {
    /**
     * Log available to this class only
     */
    private static final Logger log = LoggerFactory.getLogger(ShiroFilterChainDefinitions.class);

    @Autowired
    private SimpleRudderUserService roleService;

    @Autowired
    private SimpleRudderRole2permissionService r2pService;

    private Map<String, String> permMap = Maps.newHashMap();

    public void setRoleService(SimpleRudderUserService roleService) {
        this.roleService = roleService;
    }

    /**
     * 启动线程，每5分钟重新加载并刷新filter chain定义。
     */
    @PostConstruct
    public void startPeriodlyRefreshFilterChainDefinitionThread() {
//        new Thread() {
//            @Override
//            public void run() {
//                while (true) {
//                    try {
//                        Map<String, String> map = getFilterChainDefinitionMap();
//                        if (map == null) {
//                            map = Maps.newHashMap();
//                            setFilterChainDefinitionMap(map);
//                        }
//                        setFilterChainDefinitionMap(loadFilterChainDefinition(map));
//                        applyChainConfig();
//                        try {
//                            Thread.sleep(60 * 5 * 1000);
//                        } catch (InterruptedException e) {
//                            log.error("", e);
//                        }
//                    } catch (Throwable t) {
//                        log.error("Error occurred while refresh shiro filter chain definitions from db.", t);
//                    }
//                }
//            }
//        }.start();
    }

    /**
     * 从数据库中加载所有has-any-of-roles的filter chain定义，并与传入的定义合并。
     */
    private Map<String, String> loadFilterChainDefinition(Map<String, String> map) {

        Map<String, String> perms = r2pService.getPermissionsOfAllRoles();
        Map<String, String> permMap2 = Maps.newHashMap();

        for (Map.Entry<String,String> entry:perms.entrySet()) {
            if (map.containsKey(entry.getKey())) {
                map.put(entry.getKey(),"has-any-of-roles[" + entry.getValue() + "]");
                permMap2.put(entry.getKey(), entry.getValue());
            }
        }
        permMap = permMap2;
        return map;
    }

    /**
     * 更新has-any-of-roles对应的Filter实例中保存的appliedPaths。参见{@link PathMatchingFilter#preHandle}。
     * 本方法逻辑来自于{@link DefaultFilterChainManager#applyChainConfig}。
     */
    private void applyChainConfig() {
        Filter filter = getFilters().get("has-any-of-roles");
        if (filter instanceof PathConfigProcessor) {
            PathConfigProcessor filter2 = (PathConfigProcessor) filter;
            permMap.forEach(filter2::processPathConfig);
        } else {
            // they specified a filter configuration, but the Filter doesn't implement PathConfigProcessor
            // this is an erroneous config:
            String msg = "chainSpecificFilterConfig was specified, but the underlying " +
                    "Filter instance is not an 'instanceof' " +
                    PathConfigProcessor.class.getName() + ".  This is required if the filter is to accept " +
                    "chain-specific configuration.";
            throw new ConfigurationException(msg);
        }
    }

}
