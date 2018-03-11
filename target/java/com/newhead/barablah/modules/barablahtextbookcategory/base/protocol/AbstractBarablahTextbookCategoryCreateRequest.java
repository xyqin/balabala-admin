package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月12日 05:37:06
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
