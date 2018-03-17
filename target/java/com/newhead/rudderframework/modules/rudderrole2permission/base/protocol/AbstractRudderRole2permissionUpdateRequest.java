package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import lombok.Data;

/**
 * 角色权限关系
 * 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderRole2permissionUpdateRequest {
    /**
     *
     * 资源ID
     */
    private Long id;
    /**
     *
     * 资源编码
     */
    private Long rudderpermissionId;
    /**
     *
     * 角色
     */
    private Long rudderroleId;
    /**
     *
     * 是否显示
     */
    private Boolean visible;

}
