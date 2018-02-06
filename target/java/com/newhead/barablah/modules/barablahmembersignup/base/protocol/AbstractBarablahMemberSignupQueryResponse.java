package com.newhead.barablah.modules.barablahmembersignup.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年02月06日 05:24:57
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
