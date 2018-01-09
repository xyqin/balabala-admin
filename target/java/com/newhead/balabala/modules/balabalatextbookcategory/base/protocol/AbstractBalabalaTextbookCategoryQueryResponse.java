package com.newhead.balabala.modules.balabalatextbookcategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaTextbookCategoryQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 父ID
     */
    private LabelValueItem ParentIdObject = new LabelValueItem();

    /**
     *
     * 分类名称
     */
     private String categoryName;

    /**
     *
     * 分类路径
     */
     private String path;

    /**
     *
     * 排序号
     */
     private Integer position;

}
