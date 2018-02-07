package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 10:47:09
 */
@Data
public abstract class AbstractBarablahTextbookCreateRequest {
    /**
     *
     * 教材三级分类ID
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
    private String option;

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

    /**
     *
     * 音频
     */
    private String video;

}
