package com.newhead.balabala.modules.balabalamembershippingaddress.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月23日 02:12:59
 */
@Data
public abstract class AbstractBalabalaMemberShippingAddressUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 会员
     */
    private Long memberId;
    /**
     *
     * 收获人全名
     */
    private String fullName;
    /**
     *
     * 省市地区
     */
    private String region;
    /**
     *
     * 省市地区ID
     */
    private String regionPath;
    /**
     *
     * 街道地址
     */
    private String streetAddress;
    /**
     *
     * 电话号码
     */
    private String phoneNumber;
    /**
     *
     * 优先的
     */
    private Byte prior;

}
