package com.newhead.barablah.modules.barablahteacher.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月10日 07:58:14
 */
@Data
public abstract class AbstractBarablahTeacherCreateRequest {
    /**
     *
     * 校区ID
     */
    private Long campusId;

    /**
     *
     * 账号
     */
    private String username;

    /**
     *
     * 密码
     */
    private String password;

    /**
     *
     * 头像
     */
    private String avatar;

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
