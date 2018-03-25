package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahTextbookCategoryGetDetailResponse {
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
