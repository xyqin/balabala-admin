package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月18日 06:53:00
 */
@Data
public abstract class AbstractBarablahMemberQueryListRequest  {
    /**
     *
     * 昵称
     */
     private String nickname;

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

}