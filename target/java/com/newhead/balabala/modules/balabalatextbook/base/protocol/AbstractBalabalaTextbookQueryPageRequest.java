package com.newhead.balabala.modules.balabalatextbook.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaTextbookQueryPageRequest extends PageRequest {
    /**
     *
     * 题目类型
     */
     private String type;

}
