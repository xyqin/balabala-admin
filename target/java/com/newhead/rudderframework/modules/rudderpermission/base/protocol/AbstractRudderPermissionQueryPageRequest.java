package com.newhead.rudderframework.modules.rudderpermission.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 系统权限
 * @generated 2017年12月23日 02:12:59
 */
@Data
public abstract class AbstractRudderPermissionQueryPageRequest extends PageRequest {
    /**
     *
     * 资源名称
     */
     private String rudderpermissionName;

}