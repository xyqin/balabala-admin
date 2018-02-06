package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

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
 * @generated 2018年02月06日 05:34:57
 */
@Data
public abstract class AbstractBarablahMemberPointLogQueryResponse {
    /**
     *
     * 会员ID
     */
     private Long id;

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 积分
     */
     private Integer points;

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

}
