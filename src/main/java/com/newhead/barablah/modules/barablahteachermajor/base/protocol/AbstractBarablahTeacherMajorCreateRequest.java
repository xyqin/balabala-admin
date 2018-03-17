package com.newhead.barablah.modules.barablahteachermajor.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月18日 01:59:15
 */
@Data
public abstract class AbstractBarablahTeacherMajorCreateRequest {
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
