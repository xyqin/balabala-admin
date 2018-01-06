package com.newhead.balabala.modules.balabalateacher.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaTeacherQueryPageRequest extends PageRequest {
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
