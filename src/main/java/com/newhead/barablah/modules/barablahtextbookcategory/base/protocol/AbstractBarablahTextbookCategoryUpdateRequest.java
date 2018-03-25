package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahTextbookCategoryUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 所在科目
     */
    private Long parentId;
    /**
     *
     * 名称
     */
    private String categoryName;
    /**
     *
     * 排序号
     */
    private Integer position;

}
