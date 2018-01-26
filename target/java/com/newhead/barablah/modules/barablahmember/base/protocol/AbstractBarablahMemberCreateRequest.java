package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月26日 11:13:53
 */
@Data
public abstract class AbstractBarablahMemberCreateRequest {
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
     * 英文名
     */
    private String englishName;

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
     * 积分
     */
    private Integer points;

}
