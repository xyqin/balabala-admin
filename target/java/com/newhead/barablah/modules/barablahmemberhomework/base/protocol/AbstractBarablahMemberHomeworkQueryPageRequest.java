package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月13日 12:41:33
 */
@Data
public abstract class AbstractBarablahMemberHomeworkQueryPageRequest extends PageRequest {
    /**
     *
     * 作业名称
     */
     private String homeworkName;

    /**
     *
     * 状态
     */
     private String status;

}
