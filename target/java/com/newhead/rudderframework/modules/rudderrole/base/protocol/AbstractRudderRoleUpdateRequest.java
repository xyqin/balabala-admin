package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 系统角色
 * 2017年12月28日 03:59:21
 */
@Data
public abstract class AbstractRudderRoleUpdateRequest {
    /**
     *
     * 角色ID
     */
    private Long id;
    /**
     *
     * 资源名称
     */
    private String rudderroleName;
    /**
     *
     * 资源描述
     */
    private String rudderroleDesc;
    /**
     *
     * 角色代码
     */
    private String code;
    /**
     *
     * 是否显示
     */
    private Boolean visible;

    private String[] rudderPermissions;

}
