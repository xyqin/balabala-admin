package com.newhead.barablah.modules.barablahmemberpassport.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahMemberPassportGetDetailResponse {
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
