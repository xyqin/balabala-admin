package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahMemberPointLogCreateRequest {
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
