package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月26日 03:43:30
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
