package com.newhead.balabala.modules.balabalaclassmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月23日 02:12:58
 */
@Data
public abstract class AbstractBalabalaClassMemberCreateRequest {
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

}