package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahMemberPointLogUpdateRequest {
    /**
     *
     * 会员ID
     */
    private Long id;
    /**
     *
     * 会员ID
     */
    private Long memberId;
    /**
     *
     * 积分
     */
    private Integer points;
    /**
     *
     * 类型
     */
    private String type;

}
