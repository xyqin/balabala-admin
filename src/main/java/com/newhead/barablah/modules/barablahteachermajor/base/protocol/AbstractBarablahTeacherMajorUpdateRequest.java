package com.newhead.barablah.modules.barablahteachermajor.base.protocol;

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
public abstract class AbstractBarablahTeacherMajorUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 专业名称
     */
    private String majorName;
    /**
     *
     * 排序号
     */
    private Integer position;

}
