package com.newhead.balabala.modules.balabalamember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaMemberCreateRequest {
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
     * 网易云ID
     */
    private String accid;

    /**
     *
     * 网易云登录token
     */
    private String token;

}
