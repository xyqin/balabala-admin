package com.newhead.balabala.modules.balabalamembershippingaddress.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaMemberShippingAddressQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 会员
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

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
