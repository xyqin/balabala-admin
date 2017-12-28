package com.newhead.balabala.modules.balabalateacher.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 07:22:04
 */
@Data
public abstract class AbstractBalabalaTeacherUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
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
    /**
     *
     * 网易云ID
     */
    private String accid;
    /**
     *
     * 网易云登录token
     */
    private String token;

}
