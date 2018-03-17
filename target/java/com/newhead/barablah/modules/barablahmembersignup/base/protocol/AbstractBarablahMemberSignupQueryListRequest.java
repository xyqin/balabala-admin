package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:23
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
