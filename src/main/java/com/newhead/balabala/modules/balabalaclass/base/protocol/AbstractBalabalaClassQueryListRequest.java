package com.newhead.balabala.modules.balabalaclass.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月07日 04:52:25
 */
@Data
public abstract class AbstractBalabalaClassQueryListRequest  {
    /**
     *
     * 班级名称
     */
     private String className;

    /**
     *
     * 班长
     */
     private String monitor;

    /**
     *
     * 班长电话
     */
     private String monitorPhoneNumber;

    /**
     *
     * 状态
     */
     private String status;

}
