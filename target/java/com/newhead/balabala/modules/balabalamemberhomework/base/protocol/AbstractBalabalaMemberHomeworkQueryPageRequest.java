package com.newhead.balabala.modules.balabalamemberhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaMemberHomeworkQueryPageRequest extends PageRequest {
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
