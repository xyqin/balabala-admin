package com.newhead.balabala.modules.balabalamemberhomeworkitem.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月17日 05:42:35
 */
@Data
public abstract class AbstractBalabalaMemberHomeworkItemGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 会员作业ID
     */
    private LabelValueItem HomeworkIdObject = new LabelValueItem();

    /**
     *
     * 题目ID
     */
    private LabelValueItem TextbookIdObject = new LabelValueItem();

    /**
     *
     * 答案
     */
     private String answer;


}
