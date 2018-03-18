package com.newhead.rudderframework.modules.ruddermenu2permission.base.protocol;

import lombok.Data;

/**
 * 菜单权限关系
 * 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractRudderMenu2permissionCreateRequest {
    /**
     *
     * 菜单
     */
    private Long ruddermenuId;

    /**
     *
     * 资源编码
     */
    private Long rudderpermissionId;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

}
