package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 系统权限
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractRudderPermissionCreateRequest {
    /**
     *
     * 资源名称
     */
    private String rudderpermissionName;

    /**
     *
     * 资源描述
     */
    private String rudderpermissionDesc;

    /**
     *
     * 资源地址
     */
    private String url;

    /**
     *
     * 上级资源
     */
    private Long parentId;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

    /**
     *
     * 排序号
     */
    private Integer orderNumber;

    /**
     *
     * leaf
     */
    private Byte leaf;

}
