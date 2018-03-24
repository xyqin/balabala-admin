package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月24日 03:44:07
 */
@Data
public abstract class AbstractBarablahTextbookUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 教材四级分类
     */
    private Long categoryId;
    /**
     *
     * 题目类型
     */
    private String type;
    /**
     *
     * 题目名称
     */
    private String textbookName;
    /**
     *
     * 问题
     */
    private String question;
    /**
     *
     * 选项
     */
    @NotEmpty(message="barablahTextbook选项不能为空")
    private String option;
    /**
     *
     * 正确答案
     */
    @NotEmpty(message="barablahTextbook正确答案不能为空")
    private String correct;
    /**
     *
     * 图片
     */
    private String image;
    /**
     *
     * 音频
     */
    private String video;

}
