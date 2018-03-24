package com.newhead.barablah.modules.barablahteacherhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月24日 01:24:55
 */
@Data
public abstract class AbstractBarablahTeacherHomeworkQueryPageRequest extends PageRequest {
    /**
     *
     * 开班ID
     */
     private Long classId;

}
