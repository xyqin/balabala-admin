package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月13日 07:57:08
 */
@Data
public abstract class AbstractBarablahMemberSignupUpdateRequest {
    /**
     *
     * 会员报名ID
     */
    private Long id;
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
