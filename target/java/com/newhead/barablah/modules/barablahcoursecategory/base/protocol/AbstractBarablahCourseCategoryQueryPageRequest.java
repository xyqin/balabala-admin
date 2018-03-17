package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahCourseCategoryQueryPageRequest extends PageRequest {
    /**
     *
     * 分类名称
     */
     private String categoryName;

}
