package com.newhead.barablah.modules.barablahposition.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahPositionQueryPageRequest extends PageRequest {
    /**
     *
     * 位置名称
     */
     private String positionName;

}
