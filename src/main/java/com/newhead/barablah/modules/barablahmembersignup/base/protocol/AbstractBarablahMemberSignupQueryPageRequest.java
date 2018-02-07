package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年02月07日 10:47:09
 */
@Data
public abstract class AbstractBarablahMemberSignupQueryPageRequest extends PageRequest {
    /**
     *
     * 会员ID
     */
     private Long memberId;

    /**
     *
     * 开班ID
     */
     private Long classId;

    /**
     *
     * 支付方式
     */
     private String payment;

}
