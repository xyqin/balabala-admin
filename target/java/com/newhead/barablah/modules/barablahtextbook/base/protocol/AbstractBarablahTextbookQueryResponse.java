package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年01月25日 01:52:22
 */
@Data
public abstract class AbstractBarablahTextbookQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 教材三级分类ID
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
