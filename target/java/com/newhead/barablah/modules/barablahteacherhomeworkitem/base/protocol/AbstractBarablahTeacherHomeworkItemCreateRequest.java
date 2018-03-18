package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:28
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
