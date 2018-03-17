package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import lombok.Data;

/**
 * 系统角色
 * 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderRoleUpdateRequest {
    /**
     *
     * 角色ID
     */
    private Long id;
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
