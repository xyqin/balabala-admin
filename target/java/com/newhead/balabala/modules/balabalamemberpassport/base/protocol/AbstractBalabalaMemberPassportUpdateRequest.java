package com.newhead.balabala.modules.balabalamemberpassport.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 05:00:57
 */
@Data
public abstract class AbstractBalabalaMemberPassportUpdateRequest {
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
