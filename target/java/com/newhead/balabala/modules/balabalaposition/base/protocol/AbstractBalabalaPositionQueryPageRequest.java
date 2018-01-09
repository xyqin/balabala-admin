package com.newhead.balabala.modules.balabalaposition.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaPositionQueryPageRequest extends PageRequest {
    /**
     *
     * 位置名称
     */
     private String positionName;

}
