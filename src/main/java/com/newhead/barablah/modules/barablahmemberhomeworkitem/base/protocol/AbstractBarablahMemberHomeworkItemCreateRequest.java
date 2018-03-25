package com.newhead.barablah.modules.barablahmemberhomeworkitem.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahMemberHomeworkItemCreateRequest {
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
