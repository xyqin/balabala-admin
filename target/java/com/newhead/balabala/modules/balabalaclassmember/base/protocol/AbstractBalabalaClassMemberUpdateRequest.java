package com.newhead.balabala.modules.balabalaclassmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月06日 09:19:39
 */
@Data
public abstract class AbstractBalabalaClassMemberUpdateRequest {
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

}
