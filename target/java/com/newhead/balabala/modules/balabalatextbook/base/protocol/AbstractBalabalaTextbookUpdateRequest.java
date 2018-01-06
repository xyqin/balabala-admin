package com.newhead.balabala.modules.balabalatextbook.base.protocol;

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
public abstract class AbstractBalabalaTextbookUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 分类ID
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
     * 正确答案
     */
    private String correct;
    /**
     *
     * 图片
     */
    private String image;

}
