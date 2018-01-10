package com.newhead.balabala.modules.balabalateacherhomeworkitem.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaTeacherHomeworkItemUpdateRequest {
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