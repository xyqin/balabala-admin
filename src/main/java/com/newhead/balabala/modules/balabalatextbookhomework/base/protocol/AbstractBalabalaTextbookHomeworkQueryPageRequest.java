package com.newhead.balabala.modules.balabalatextbookhomework.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookHomeworkQueryPageRequest extends PageRequest {
    /**
     *
     * 作业类型
     */
     private String type;

}
