package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 系统权限
 * @generated 2018年01月26日 03:43:31
 */
@Data
public abstract class AbstractRudderPermissionQueryResponse {
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
