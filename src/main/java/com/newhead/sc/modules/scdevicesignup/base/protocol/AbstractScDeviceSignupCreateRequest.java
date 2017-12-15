package com.newhead.sc.modules.scdevicesignup.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月13日 12:17:48
 */
@Data
public abstract class AbstractScDeviceSignupCreateRequest {
    /**
     *
     * 设备ID
     */
    private Long deviceId;

    /**
     *
     * 手机号码
     */
    private String phoneNumber;

}
