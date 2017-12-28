package com.newhead.balabala.modules.balabalamemberpassport.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月28日 05:00:57
 */
@Data
public abstract class AbstractBalabalaMemberPassportGetDetailResponse {
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
