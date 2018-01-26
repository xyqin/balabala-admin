package com.newhead.barablah.modules.barablahmemberpassport.base.protocol;

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
 * @generated 2018年01月26日 11:13:53
 */
@Data
public abstract class AbstractBarablahMemberPassportQueryResponse {
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
     * 帐号来源
     */
     private String provider;

    /**
     *
     * 帐号授权ID
     */
     private String providerId;

    /**
     *
     * 密码
     */
     private String password;

}
