package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import lombok.Data;

/**
 * 系统用户
 * @generated 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderUserQueryListRequest  {
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
