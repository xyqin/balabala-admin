package com.newhead.balabala.modules.balabalaclassmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 06:54:54
 */
@Data
public abstract class AbstractBalabalaClassMemberQueryPageRequest extends PageRequest {
    /**
     *
     * 是否试听
     */
     private Boolean probational;

}
