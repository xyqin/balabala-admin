package com.newhead.barablah.modules.barablahregion.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahRegionQueryPageRequest extends PageRequest {
    /**
     *
     * 地区名称
     */
     private String regionName;

}
