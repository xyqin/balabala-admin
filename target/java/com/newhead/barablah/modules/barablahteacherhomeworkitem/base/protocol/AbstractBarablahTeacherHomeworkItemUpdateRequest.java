package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

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
public abstract class AbstractBarablahTeacherHomeworkItemUpdateRequest {
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
     * 教师发布作业ID
     */
    private Long homeworkId;
    /**
     *
     * 题目ID
     */
    private Long textbookId;

}
