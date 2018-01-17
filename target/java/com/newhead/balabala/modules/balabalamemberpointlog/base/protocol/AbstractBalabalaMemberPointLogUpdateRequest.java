package com.newhead.balabala.modules.balabalamemberpointlog.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月17日 05:42:35
 */
@Data
public abstract class AbstractBalabalaMemberPointLogUpdateRequest {
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
