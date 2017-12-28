package com.newhead.balabala.modules.balabalacourse.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 05:00:57
 */
@Data
public abstract class AbstractBalabalaCourseQueryPageRequest extends PageRequest {
    /**
     *
     * 课程名称
     */
     private String courseName;

}
