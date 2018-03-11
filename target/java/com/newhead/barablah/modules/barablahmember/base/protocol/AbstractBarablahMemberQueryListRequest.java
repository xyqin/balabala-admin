package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月12日 05:37:05
 */
@Data
public abstract class AbstractBarablahMemberQueryListRequest  {
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
     * 性别
     */
     private String gender;

    /**
     *
     * 状态
     */
     private String status;

}
