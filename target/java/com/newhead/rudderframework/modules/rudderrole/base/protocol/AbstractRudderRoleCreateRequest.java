package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import lombok.Data;

/**
 * 系统角色
 * 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractRudderRoleCreateRequest {
    /**
     *
     * 资源名称
     */
    private String rudderroleName;

    /**
     *
     * 资源描述
     */
    private String rudderroleDesc;

    /**
     *
     * 角色代码
     */
    private String code;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

    private String[] rudderPermissions;

}
