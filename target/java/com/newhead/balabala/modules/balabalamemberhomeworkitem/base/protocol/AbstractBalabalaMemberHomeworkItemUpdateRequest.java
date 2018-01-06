package com.newhead.balabala.modules.balabalamemberhomeworkitem.base.protocol;

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
public abstract class AbstractBalabalaMemberHomeworkItemUpdateRequest {
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
