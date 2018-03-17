package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahClassMemberQueryListRequest  {
    /**
     *
     * 开班ID
     */
     private Long classId;

    /**
     *
     * 会员ID
     */
     private Long memberId;

    /**
     *
     * 状态
     */
     private String status;

}
