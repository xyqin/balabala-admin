package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahCourseCategoryUpdateRequest {
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
