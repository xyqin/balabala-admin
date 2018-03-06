package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月06日 04:53:28
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
