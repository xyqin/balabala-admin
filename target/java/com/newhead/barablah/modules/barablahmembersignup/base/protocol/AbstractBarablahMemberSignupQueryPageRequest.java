package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月22日 08:05:46
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
     * 班级
     */
     private Long classId;

    /**
     *
     * 支付方式
     */
     private String payment;

}
