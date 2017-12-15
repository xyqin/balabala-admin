package com.newhead.sc.modules.scdevicesignup.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2017年12月13日 12:17:48
 */
@Data
public abstract class AbstractScDeviceSignupQueryListRequest  {
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
