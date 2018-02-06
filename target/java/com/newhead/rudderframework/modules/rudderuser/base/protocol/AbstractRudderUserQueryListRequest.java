package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 系统用户
 * @generated 2018年02月06日 03:55:39
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
