package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月13日 07:57:08
 */
@Data
public abstract class AbstractBarablahMemberSignupQueryListRequest  {
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
