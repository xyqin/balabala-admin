package com.newhead.rudderframework.modules.ruddermenu.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 菜单
 * 2018年03月13日 09:32:03
 */
@Data
public abstract class AbstractRudderMenuGetDetailResponse {
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
