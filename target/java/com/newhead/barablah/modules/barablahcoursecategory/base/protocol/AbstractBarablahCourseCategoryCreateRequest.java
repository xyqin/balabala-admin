package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:27
 */
@Data
public abstract class AbstractBarablahCourseCategoryCreateRequest {
    /**
     *
     * 分类名称
     */
    private String categoryName;

}
