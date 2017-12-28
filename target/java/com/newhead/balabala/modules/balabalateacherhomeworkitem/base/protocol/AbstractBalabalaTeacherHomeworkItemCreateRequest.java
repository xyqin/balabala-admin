package com.newhead.balabala.modules.balabalateacherhomeworkitem.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 07:22:04
 */
@Data
public abstract class AbstractBalabalaTeacherHomeworkItemCreateRequest {
    /**
     *
     * 教师ID
     */
    private Long teacherId;

    /**
     *
     * 教师发布作业ID
     */
    private Long homeworkId;

    /**
     *
     * 题目ID
     */
    private Long textbookId;

}
