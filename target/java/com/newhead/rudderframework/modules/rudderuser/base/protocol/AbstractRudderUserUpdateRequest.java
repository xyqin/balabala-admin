package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 系统用户
 * 2018年03月13日 09:32:03
 */
@Data
public abstract class AbstractRudderUserUpdateRequest {
    /**
     *
     * 资源ID
     */
    private Long id;
    /**
     *
     * 账号名称
     */
    private String rudderuserName;
    /**
     *
     * 备注
     */
    private String rudderuserDesc;
    /**
     *
     * 密码
     */
    private String password;
    /**
     *
     * 用户状态
     */
    private String status;
    /**
     *
     * 昵称
     */
    private String nickname;
    /**
     *
     * salt
     */
    @NotEmpty(message="rudderUsersalt不能为空")
    private String salt;
    /**
     *
     * email
     */
    private String email;
    /**
     *
     * 是否显示
     */
    private Boolean visible;
    /**
     *
     * 校区ID
     */
    private Long campusId;

    private String[] rudderRoles;

}
