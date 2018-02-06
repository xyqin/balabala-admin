package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月06日 05:24:57
 */
@Data
public abstract class AbstractBarablahMemberHomeworkCreateRequest {
    /**
     *
     * 会员ID
     */
    private Long memberId;

    /**
     *
     * 教师ID
     */
    private Long teacherId;

    /**
     *
     * 作业名称
     */
    private String homeworkName;

    /**
     *
     * 状态
     */
    private String status;

}
