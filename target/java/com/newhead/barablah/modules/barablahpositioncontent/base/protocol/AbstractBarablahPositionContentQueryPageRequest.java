package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:23
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
