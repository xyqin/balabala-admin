package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:21
 */
@Data
public abstract class AbstractBarablahClassLessonQueryPageRequest extends PageRequest {
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
