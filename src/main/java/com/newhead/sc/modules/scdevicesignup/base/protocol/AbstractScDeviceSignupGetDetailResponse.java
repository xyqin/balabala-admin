package com.newhead.sc.modules.scdevicesignup.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月13日 12:17:48
 */
@Data
public abstract class AbstractScDeviceSignupGetDetailResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 设备ID
     */
    private LabelValueItem DeviceIdObject = new LabelValueItem();

    /**
     *
     * 手机号码
     */
     private String phoneNumber;


}
