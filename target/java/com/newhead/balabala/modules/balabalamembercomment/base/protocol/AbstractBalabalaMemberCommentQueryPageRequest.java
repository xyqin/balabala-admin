package com.newhead.balabala.modules.balabalamembercomment.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 05:00:58
 */
@Data
public abstract class AbstractBalabalaMemberCommentQueryPageRequest extends PageRequest {
    /**
     *
     * 评语内容
     */
     private String content;

}
