package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年02月06日 05:34:56
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
