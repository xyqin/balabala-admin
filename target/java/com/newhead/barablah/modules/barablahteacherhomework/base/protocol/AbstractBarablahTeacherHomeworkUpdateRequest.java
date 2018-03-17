package com.newhead.barablah.modules.barablahteacherhomework.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:23
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
