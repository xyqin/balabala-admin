package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:27
 */
@Data
public abstract class AbstractBarablahClassMemberCreateRequest {
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
