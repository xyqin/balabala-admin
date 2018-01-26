package com.newhead.barablah.modules.barablahcourse.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月26日 03:39:49
 */
@Data
public abstract class AbstractBarablahCourseQueryPageRequest extends PageRequest {
    /**
     *
     * 课程名称
     */
     private String courseName;

}
