package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 系统角色
 * @generated 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractRudderRoleQueryPageRequest extends PageRequest {
    /**
     *
     * 资源名称
     */
     private String rudderroleName;

}
