package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 05:08:28
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
