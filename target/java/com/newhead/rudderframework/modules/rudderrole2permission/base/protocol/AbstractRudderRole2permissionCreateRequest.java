package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 角色权限关系
 * 2018年01月18日 06:53:00
 */
@Data
public abstract class AbstractRudderRole2permissionCreateRequest {
    /**
     *
     * 资源编码
     */
    private Long rudderpermissionId;

    /**
     *
     * 角色
     */
    private Long rudderroleId;

    /**
     *
     * 是否显示
     */
    private Boolean visible;

}
