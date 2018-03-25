package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

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
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahTextbookCategoryQueryResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 所在科目
     */
    private LabelValueItem ParentIdObject = new LabelValueItem();

    /**
     *
     * 名称
     */
     private String categoryName;

    /**
     *
     * 排序号
     */
     private Integer position;

}
