package com.newhead.balabala.modules.balabalamember.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaMemberQueryListRequest  {
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
