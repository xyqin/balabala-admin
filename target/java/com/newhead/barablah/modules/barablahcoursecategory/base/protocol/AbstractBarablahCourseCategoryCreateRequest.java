package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

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
