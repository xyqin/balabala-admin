package com.newhead.balabala.modules.balabalatextbookhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookHomeworkCreateRequest {
    /**
     *
     * 教材ID
     */
    private Long textbookId;

    /**
     *
     * 作业名称
     */
    private String homeworkName;

    /**
     *
     * 作业类型
     */
    private String type;

    /**
     *
     * 问题
     */
    private String question;

    /**
     *
     * 正确答案
     */
    private String correct;

    /**
     *
     * 图片
     */
    private String image;

}
