package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 10:47:09
 */
@Data
public abstract class AbstractBarablahMemberUpdateRequest {
    /**
     *
     * 会员ID
     */
    private Long id;
    /**
     *
     * 校区ID
     */
    private Long campusId;
    /**
     *
     * 昵称
     */
    private String nickname;
    /**
     *
     * 头像
     */
    private String avatar;
    /**
     *
     * 性别
     */
    private String gender;
    /**
     *
     * 生日
     */
    private String birthday;
    /**
     *
     * 状态
     */
    private String status;
    /**
     *
     * 积分
     */
    private Integer points;

}
