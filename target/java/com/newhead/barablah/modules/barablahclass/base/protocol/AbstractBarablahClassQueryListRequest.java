package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahClassQueryListRequest  {
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
