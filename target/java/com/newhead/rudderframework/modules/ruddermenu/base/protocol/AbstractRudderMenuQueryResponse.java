package com.newhead.rudderframework.modules.ruddermenu.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 菜单
 * @generated 2018年03月11日 09:18:46
 */
@Data
public abstract class AbstractRudderMenuQueryResponse {
    /**
     *
     * 菜单ID
     */
     private Long id;

    /**
     *
     * 菜单名称
     */
     private String ruddermenuName;

    /**
     *
     * 菜单描述
     */
     private String ruddermenuDesc;

    /**
     *
     * 菜单链接
     */
     private String url;

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
     * 上级菜单
     */
    private LabelValueItem ParentIdObject = new LabelValueItem();

    /**
     *
     * 上级资源
     */
    private LabelValueItem ResourceIdObject = new LabelValueItem();

}
