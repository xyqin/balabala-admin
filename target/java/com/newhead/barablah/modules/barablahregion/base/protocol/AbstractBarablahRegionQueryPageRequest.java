package com.newhead.barablah.modules.barablahregion.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahRegionQueryPageRequest extends PageRequest {
    /**
     *
     * 地区名称
     */
     private String regionName;

}
