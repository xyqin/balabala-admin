package com.newhead.balabala.modules.balabalaclassmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaClassMemberQueryPageRequest extends PageRequest {
    /**
     *
     * 状态
     */
     private String status;

}
