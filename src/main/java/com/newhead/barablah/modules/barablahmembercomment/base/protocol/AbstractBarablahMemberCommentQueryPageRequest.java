package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahMemberCommentQueryPageRequest extends PageRequest {
    /**
     *
     * 班级
     */
     private Long classId;

    /**
     *
     * 评语内容
     */
     private String content;

    /**
     *
     * 性别
     */
     private String commentType;

}
