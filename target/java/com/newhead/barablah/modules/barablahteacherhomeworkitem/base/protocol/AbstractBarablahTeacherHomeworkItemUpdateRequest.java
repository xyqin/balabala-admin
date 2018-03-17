package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:23
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
