package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahTextbookGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 教材四级分类
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 题目类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

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
