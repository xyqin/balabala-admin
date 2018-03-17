package com.newhead.barablah.modules.barablahmemberpassport.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahMemberPassportCreateRequest {
    /**
     *
     * 会员ID
     */
    private Long memberId;

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
