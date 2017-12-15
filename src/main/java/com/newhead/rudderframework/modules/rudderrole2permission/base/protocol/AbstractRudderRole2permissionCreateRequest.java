package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 角色权限关系
 * 2017年05月07日 06:44:32
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
