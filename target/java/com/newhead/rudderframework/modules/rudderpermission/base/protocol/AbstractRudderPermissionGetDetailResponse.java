package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 系统权限
 * 2018年02月07日 10:47:09
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
