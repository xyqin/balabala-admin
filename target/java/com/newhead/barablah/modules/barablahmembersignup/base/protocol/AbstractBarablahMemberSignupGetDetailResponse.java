package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年02月06日 03:38:25
 */
@Data
public abstract class AbstractBarablahMemberSignupGetDetailResponse {
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
     * 开班ID
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


}
