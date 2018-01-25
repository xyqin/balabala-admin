package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahTextbookQueryPageRequest extends PageRequest {
    /**
     *
     * 题目类型
     */
     private String type;

}
