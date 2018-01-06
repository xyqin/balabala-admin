package com.newhead.balabala.modules.balabalateacherhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaTeacherHomeworkUpdateRequest {
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
