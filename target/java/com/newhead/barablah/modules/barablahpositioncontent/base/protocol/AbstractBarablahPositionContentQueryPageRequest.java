package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月13日 09:32:03
 */
@Data
public abstract class AbstractBarablahPositionContentQueryPageRequest extends PageRequest {
    /**
     *
     * 位置ID
     */
     private Long positionId;

    /**
     *
     * 内容名称
     */
     private String contentName;

}
