package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月10日 07:58:15
 */
@Data
public abstract class AbstractBarablahMemberPointLogGetDetailResponse {
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
