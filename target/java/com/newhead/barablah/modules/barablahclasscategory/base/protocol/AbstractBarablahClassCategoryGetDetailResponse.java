package com.newhead.barablah.modules.barablahclasscategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月24日 04:28:59
 */
@Data
public abstract class AbstractBarablahClassCategoryGetDetailResponse {
    /**
     *
     * 班级分类ID
     */
     private Long id;

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


}
