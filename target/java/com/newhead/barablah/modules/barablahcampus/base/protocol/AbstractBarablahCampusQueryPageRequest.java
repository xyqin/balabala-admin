package com.newhead.barablah.modules.barablahcampus.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月10日 07:58:14
 */
@Data
public abstract class AbstractBarablahCampusQueryPageRequest extends PageRequest {
    /**
     *
     * 校区名称
     */
     private String campusName;

}
