package com.newhead.sc.modules.scdevice.base.protocol;

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
 * @generated 2017年12月13日 12:17:48
 */
@Data
public abstract class AbstractScDeviceQueryResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 设备名称
     */
     private String deviceName;

    /**
     *
     * 设备厂家
     */
     private String vendor;

    /**
     *
     * 设备型号
     */
     private String model;

    /**
     *
     * 设备图片
     */
     private String image;

    /**
     *
     * 设备安装位置
     */
     private String installLocation;

    /**
     *
     * 设备配置
     */
     private String config;

    /**
     *
     * 设备类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

}
