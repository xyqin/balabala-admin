package com.newhead.barablah.modules.barablahmemberpointlog.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 04:00:58
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
