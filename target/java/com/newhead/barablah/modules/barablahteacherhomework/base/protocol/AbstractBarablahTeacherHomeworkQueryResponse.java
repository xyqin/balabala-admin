package com.newhead.barablah.modules.barablahteacherhomework.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 教师ID
     */
    private LabelValueItem TeacherIdObject = new LabelValueItem();

    /**
     *
     * 作业名称
     */
     private String homeworkName;

}
