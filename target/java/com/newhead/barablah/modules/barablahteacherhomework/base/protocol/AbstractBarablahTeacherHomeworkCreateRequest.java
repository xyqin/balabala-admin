package com.newhead.barablah.modules.barablahteacherhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 10:47:09
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkCreateRequest {
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
