package com.newhead.sc.modules.scdevicesignup.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月13日 12:17:48
 */
@Data
public abstract class AbstractScDeviceSignupQueryPageRequest extends PageRequest {
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
