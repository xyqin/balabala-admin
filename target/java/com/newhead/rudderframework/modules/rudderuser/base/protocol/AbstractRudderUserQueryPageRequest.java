package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 系统用户
 * @generated 2018年03月11日 09:18:47
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
