package com.newhead.rudderframework.modules.ruddermenu.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 菜单
 * 2018年01月18日 06:53:00
 */
@Data
public abstract class AbstractRudderMenuCreateRequest {
    /**
     *
     * 菜单名称
     */
    private String ruddermenuName;

    /**
     *
     * 菜单描述
     */
    private String ruddermenuDesc;

    /**
     *
     * 菜单链接
     */
    private String url;

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
     * 上级菜单
     */
    private Long parentId;

    /**
     *
     * 上级资源
     */
    private Long resourceId;

}
