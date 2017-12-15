package com.newhead.sc.modules.scdevice.base.protocol;

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
public abstract class AbstractScDeviceUpdateRequest {
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
    private String type;

}
