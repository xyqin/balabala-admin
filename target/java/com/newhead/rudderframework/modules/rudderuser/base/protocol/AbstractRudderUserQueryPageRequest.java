package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 系统用户
 * @generated 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractRudderUserQueryPageRequest extends PageRequest {
    /**
     *
     * 账号名称
     */
     private String rudderuserName;

    /**
     *
     * 用户状态
     */
     private String status;

}
