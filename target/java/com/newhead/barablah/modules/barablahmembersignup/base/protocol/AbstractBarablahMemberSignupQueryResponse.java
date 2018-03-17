package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahMemberSignupQueryResponse {
    /**
     *
     * 会员报名ID
     */
     private Long id;

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 班级
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

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
