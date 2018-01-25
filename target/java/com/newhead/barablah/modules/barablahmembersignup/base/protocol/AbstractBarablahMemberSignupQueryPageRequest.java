package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月25日 03:24:36
 */
@Data
public abstract class AbstractBarablahMemberSignupQueryPageRequest extends PageRequest {
    /**
     *
     * 支付方式
     */
     private String payment;

}
