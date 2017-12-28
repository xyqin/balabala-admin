package com.newhead.balabala.modules.balabalatextbook.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 01:55:49
 */
@Data
public abstract class AbstractBalabalaTextbookQueryPageRequest extends PageRequest {
    /**
     *
     * 题目类型
     */
     private String type;

}
