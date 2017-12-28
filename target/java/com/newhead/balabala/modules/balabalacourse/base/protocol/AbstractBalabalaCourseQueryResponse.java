package com.newhead.balabala.modules.balabalacourse.base.protocol;

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
 * @generated 2017年12月28日 06:54:54
 */
@Data
public abstract class AbstractBalabalaCourseQueryResponse {
    /**
     *
     * 课程ID
     */
     private Long id;

    /**
     *
     * 课程分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 教材ID
     */
    private LabelValueItem TextbookIdObject = new LabelValueItem();

    /**
     *
     * 课程名称
     */
     private String courseName;

    /**
     *
     * 线上授课次数
     */
     private Short onlineLessons;

    /**
     *
     * 线上授课时长
     */
     private Short onlineDuration;

    /**
     *
     * 线下授课次数
     */
     private Short offlineLessons;

    /**
     *
     * 线下授课时长
     */
     private Short offlineDuration;

    /**
     *
     * 总部抽取佣金
     */
     private BigDecimal commission;

}
