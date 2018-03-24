package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月22日 08:32:11
 */
@Data
public abstract class AbstractBarablahCourseCategoryCreateRequest {
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
