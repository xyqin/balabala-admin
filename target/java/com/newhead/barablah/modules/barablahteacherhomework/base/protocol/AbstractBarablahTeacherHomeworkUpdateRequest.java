package com.newhead.barablah.modules.barablahteacherhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 教师ID
     */
    private Long teacherId;
    /**
     *
     * 作业名称
     */
    private String homeworkName;

}