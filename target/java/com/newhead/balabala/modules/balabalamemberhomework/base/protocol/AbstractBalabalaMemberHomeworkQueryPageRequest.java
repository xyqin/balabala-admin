package com.newhead.balabala.modules.balabalamemberhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 07:22:04
 */
@Data
public abstract class AbstractBalabalaMemberHomeworkQueryPageRequest extends PageRequest {
    /**
     *
     * 作业名称
     */
     private String homeworkName;

}
