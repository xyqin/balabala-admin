package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:21
 */
@Data
public abstract class AbstractBarablahClassLessonQueryListRequest  {
    /**
     *
     * 开班ID
     */
     private Long classId;

    /**
     *
     * 教师ID
     */
     private Long teacherId;

    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 类型
     */
     private String type;

}
