package com.newhead.barablah.modules.barablahmemberhomeworkitem.base.protocol;

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
public abstract class AbstractBarablahMemberHomeworkItemUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 会员ID
     */
    private Long memberId;
    /**
     *
     * 会员作业ID
     */
    private Long homeworkId;
    /**
     *
     * 题目ID
     */
    private Long textbookId;
    /**
     *
     * 答案
     */
    private String answer;

}
