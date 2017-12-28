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
 * @generated 2017年12月28日 03:59:21
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

}
