package com.newhead.barablah.modules.barablahmemberpassport.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月13日 09:32:02
 */
@Data
public abstract class AbstractBarablahMemberPassportUpdateRequest {
    /**
     *
     * 会员ID
     */
    private Long id;
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
