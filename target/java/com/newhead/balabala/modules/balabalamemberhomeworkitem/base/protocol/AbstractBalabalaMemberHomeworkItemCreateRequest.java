package com.newhead.balabala.modules.balabalamemberhomeworkitem.base.protocol;

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
public abstract class AbstractBalabalaMemberHomeworkItemCreateRequest {
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
