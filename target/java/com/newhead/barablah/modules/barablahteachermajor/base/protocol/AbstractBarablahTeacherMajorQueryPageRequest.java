package com.newhead.barablah.modules.barablahteachermajor.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahTeacherMajorQueryPageRequest extends PageRequest {
    /**
     *
     * 专业名称
     */
     private String majorName;

}
