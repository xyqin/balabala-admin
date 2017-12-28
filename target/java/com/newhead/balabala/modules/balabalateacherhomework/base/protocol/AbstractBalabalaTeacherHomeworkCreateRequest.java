package com.newhead.balabala.modules.balabalateacherhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 05:00:58
 */
@Data
public abstract class AbstractBalabalaTeacherHomeworkCreateRequest {
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
