package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月06日 04:53:29
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
     * 开班ID
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
