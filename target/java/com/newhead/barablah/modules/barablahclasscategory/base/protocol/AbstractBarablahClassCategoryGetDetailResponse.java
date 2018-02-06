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
 * 2018年02月06日 05:24:56
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


}
