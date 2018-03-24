package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月24日 04:28:59
 */
@Data
public abstract class AbstractBarablahClassLessonQueryPageRequest extends PageRequest {
    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 班级
     */
     private Long classId;

    /**
     *
     * 类型
     */
     private String status;

    /**
     *
     * 类型
     */
     private String type;

}
