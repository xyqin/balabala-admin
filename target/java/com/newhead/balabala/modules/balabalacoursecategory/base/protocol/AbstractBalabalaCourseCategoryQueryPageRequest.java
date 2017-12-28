package com.newhead.balabala.modules.balabalacoursecategory.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 05:00:57
 */
@Data
public abstract class AbstractBalabalaCourseCategoryQueryPageRequest extends PageRequest {
    /**
     *
     * 分类名称
     */
     private String categoryName;

}
