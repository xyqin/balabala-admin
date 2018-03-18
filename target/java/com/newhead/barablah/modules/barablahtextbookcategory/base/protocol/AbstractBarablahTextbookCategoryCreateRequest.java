package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahTextbookCategoryCreateRequest {
    /**
     *
     * 父ID
     */
    private Long parentId;

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
