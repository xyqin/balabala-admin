package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月26日 03:43:30
 */
@Data
public abstract class AbstractBarablahCourseCategoryGetDetailResponse {
    /**
     *
     * 课程分类ID
     */
     private Long id;

    /**
     *
     * 分类名称
     */
     private String categoryName;


}
