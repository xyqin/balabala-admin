package com.newhead.barablah.modules.barablahcoursecategory.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月22日 08:32:11
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
    /**
     *
     * 排序号
     */
    private Integer position;

}
