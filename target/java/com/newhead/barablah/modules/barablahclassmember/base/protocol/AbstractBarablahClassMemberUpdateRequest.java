package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahClassMemberUpdateRequest {
    /**
     *
     * 开班会员ID
     */
    private Long id;
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
