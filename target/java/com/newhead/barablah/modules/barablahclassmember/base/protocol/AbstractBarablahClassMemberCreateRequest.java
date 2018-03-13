package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月13日 09:32:01
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
