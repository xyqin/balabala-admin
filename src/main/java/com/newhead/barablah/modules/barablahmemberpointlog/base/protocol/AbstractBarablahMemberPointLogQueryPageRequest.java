package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月18日 06:53:00
 */
@Data
public abstract class AbstractBarablahMemberPointLogQueryPageRequest extends PageRequest {
    /**
     *
     * 类型
     */
     private String type;

}