package com.newhead.barablah.modules.barablahclasscategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 04:55:38
 */
@Data
public abstract class AbstractBarablahClassCategoryCreateRequest {
    /**
     *
     * 分类名称
     */
    private String categoryName;

}
