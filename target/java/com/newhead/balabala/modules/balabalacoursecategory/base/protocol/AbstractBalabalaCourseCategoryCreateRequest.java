package com.newhead.balabala.modules.balabalacoursecategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 05:00:57
 */
@Data
public abstract class AbstractBalabalaCourseCategoryCreateRequest {
    /**
     *
     * 分类名称
     */
    private String categoryName;

}
