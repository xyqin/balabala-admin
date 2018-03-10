package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import lombok.Data;

/**
 * 系统权限
 * 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractRudderPermissionCreateRequest {
    /**
     *
     * 资源名称
     */
    private String rudderpermissionName;

    /**
     *
     * 资源描述
     */
    private String rudderpermissionDesc;

    /**
     *
     * 资源地址
     */
    private String url;

    /**
     *
     * 上级资源
     */
    private Long parentId;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

    /**
     *
     * 排序号
     */
    private Integer orderNumber;

    /**
     *
     * leaf
     */
    private Byte leaf;

}
