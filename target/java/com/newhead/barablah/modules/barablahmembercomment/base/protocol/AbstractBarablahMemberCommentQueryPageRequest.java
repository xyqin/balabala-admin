package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahMemberCommentQueryPageRequest extends PageRequest {
    /**
     *
     * 评语内容
     */
     private String content;

}
