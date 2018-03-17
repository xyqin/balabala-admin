package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 系统权限
 * 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderPermissionGetDetailResponse {
    /**
     *
     * 资源ID
     */
     private Long id;

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
    private LabelValueItem ParentIdObject = new LabelValueItem();

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
