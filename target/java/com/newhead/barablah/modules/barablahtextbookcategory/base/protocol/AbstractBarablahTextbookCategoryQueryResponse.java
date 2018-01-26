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
 * @generated 2018年01月26日 11:13:53
 */
@Data
public abstract class AbstractBarablahTextbookCategoryQueryResponse {
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
     * 排序号
     */
     private Integer position;

    /**
     *
     * 资源地址
     */
     private String url;

}
