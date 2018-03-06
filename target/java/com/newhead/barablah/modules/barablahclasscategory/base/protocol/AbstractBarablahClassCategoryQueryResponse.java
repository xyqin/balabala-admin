package com.newhead.barablah.modules.barablahclasscategory.base.protocol;

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
 * @generated 2018年03月06日 04:53:27
 */
@Data
public abstract class AbstractBarablahClassCategoryQueryResponse {
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
