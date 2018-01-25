package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 系统角色
 * @generated 2018年01月25日 01:52:22
 */
@Data
public abstract class AbstractRudderRoleQueryPageRequest extends PageRequest {
    /**
     *
     * 资源名称
     */
     private String rudderroleName;

}
