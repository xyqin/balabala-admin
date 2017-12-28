package com.newhead.balabala.modules.balabalatextbook.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月28日 06:54:54
 */
@Data
public abstract class AbstractBalabalaTextbookGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 分类ID
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
     * 正确答案
     */
     private String correct;

    /**
     *
     * 图片
     */
     private String image;


}
