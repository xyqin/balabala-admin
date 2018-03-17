package com.newhead.barablah.modules.barablahteacherhomeworkitem.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkItemQueryResponse {
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
     * 教师发布作业ID
     */
    private LabelValueItem HomeworkIdObject = new LabelValueItem();

    /**
     *
     * 题目ID
     */
    private LabelValueItem TextbookIdObject = new LabelValueItem();

}
