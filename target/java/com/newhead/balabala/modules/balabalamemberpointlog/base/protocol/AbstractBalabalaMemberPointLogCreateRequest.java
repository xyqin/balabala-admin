package com.newhead.balabala.modules.balabalamemberpointlog.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaMemberPointLogCreateRequest {
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
