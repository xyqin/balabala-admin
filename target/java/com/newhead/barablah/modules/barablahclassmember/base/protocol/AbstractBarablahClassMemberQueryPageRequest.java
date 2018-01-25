package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月25日 01:52:22
 */
@Data
public abstract class AbstractBarablahClassMemberQueryPageRequest extends PageRequest {
    /**
     *
     * 状态
     */
     private String status;

}
