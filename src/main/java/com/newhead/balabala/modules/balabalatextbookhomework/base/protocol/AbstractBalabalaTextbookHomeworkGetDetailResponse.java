package com.newhead.balabala.modules.balabalatextbookhomework.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookHomeworkGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 教材ID
     */
    private LabelValueItem TextbookIdObject = new LabelValueItem();

    /**
     *
     * 作业名称
     */
     private String homeworkName;

    /**
     *
     * 作业类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

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
