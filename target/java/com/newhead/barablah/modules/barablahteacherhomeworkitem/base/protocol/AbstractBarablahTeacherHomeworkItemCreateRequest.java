package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkItemCreateRequest {
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
