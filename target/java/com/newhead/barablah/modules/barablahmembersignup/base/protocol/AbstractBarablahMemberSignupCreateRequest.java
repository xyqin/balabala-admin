package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahMemberSignupCreateRequest {
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
     * 报名费用
     */
    private BigDecimal amount;

    /**
     *
     * 支付方式
     */
    private String payment;

    /**
     *
     * 系统创建时间
     */
    private Date createdAt;

}
