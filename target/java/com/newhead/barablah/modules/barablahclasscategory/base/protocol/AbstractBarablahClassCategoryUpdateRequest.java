package com.newhead.barablah.modules.barablahclasscategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月10日 07:58:14
 */
@Data
public abstract class AbstractBarablahClassCategoryUpdateRequest {
    /**
     *
     * 班级分类ID
     */
    private Long id;
    /**
     *
     * 分类名称
     */
    private String categoryName;

}
