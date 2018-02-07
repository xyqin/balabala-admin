package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 角色权限关系
 * 2018年02月07日 04:00:58
 */
@Data
public abstract class AbstractRudderRole2permissionUpdateRequest {
    /**
     *
     * 资源ID
     */
    private Long id;
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
