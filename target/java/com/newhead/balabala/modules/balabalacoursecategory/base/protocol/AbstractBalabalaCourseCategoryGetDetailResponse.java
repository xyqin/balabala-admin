package com.newhead.balabala.modules.balabalacoursecategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaCourseCategoryGetDetailResponse {
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
