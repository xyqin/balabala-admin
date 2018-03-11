package com.newhead.barablah.modules.barablahteacher.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月12日 05:37:06
 */
@Data
public abstract class AbstractBarablahTeacherQueryListRequest  {
    /**
     *
     * 校区
     */
     private Long campusId;

    /**
     *
     * 账号
     */
     private String username;

    /**
     *
     * 姓名
     */
     private String fullName;

    /**
     *
     * 手机号
     */
     private String phoneNumber;

    /**
     *
     * 专业
     */
     private String major;

    /**
     *
     * 来自哪里
     */
     private String comeFrom;

    /**
     *
     * 状态
     */
     private String status;

}
