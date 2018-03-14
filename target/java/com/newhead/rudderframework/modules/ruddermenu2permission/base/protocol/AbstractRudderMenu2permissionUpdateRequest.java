package com.newhead.rudderframework.modules.ruddermenu2permission.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 菜单权限关系
 * 2018年03月13日 09:32:03
 */
@Data
public abstract class AbstractRudderMenu2permissionUpdateRequest {
    /**
     *
     * 资源ID
     */
    private Long id;
    /**
     *
     * 菜单
     */
    private Long ruddermenuId;
    /**
     *
     * 资源编码
     */
    private Long rudderpermissionId;
    /**
     *
     * 是否显示
     */
    private Boolean visible;

}
