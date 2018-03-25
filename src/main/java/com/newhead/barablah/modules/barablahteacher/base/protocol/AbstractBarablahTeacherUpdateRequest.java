package com.newhead.barablah.modules.barablahteacher.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahTeacherUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 所在校区
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
     * 姓名
     */
    private String fullName;
    /**
     *
     * 头像
     */
    private String avatar;
    /**
     *
     * 手机号
     */
    private String phoneNumber;
    /**
     *
     * 专业
     */
    private Long major;
    /**
     *
     * 国籍
     */
    private Long comeFrom;
    /**
     *
     * 状态
     */
    private String status;

}
