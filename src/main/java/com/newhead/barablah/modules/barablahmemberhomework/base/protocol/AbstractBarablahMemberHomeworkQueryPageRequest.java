package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:21
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

    /**
     *
     * 开班ID
     */
     private Long classId;

}
