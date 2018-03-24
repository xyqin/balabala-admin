package com.newhead.barablah.modules.barablahcourse.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月24日 03:44:06
 */
@Data
public abstract class AbstractBarablahCourseGetDetailResponse {
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
     * 教材三级分类
     */
    private LabelValueItem TextbookCategoryIdObject = new LabelValueItem();

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
     * 最大允许线上授课节数
     */
     private Short onlineMaxLessons;

    /**
     *
     * 线上授课时长
     */
     private Short onlineDuration;

    /**
     *
     * 最大允许线上授课时长
     */
     private Short onlineMaxDuration;

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
     * 总部抽取佣金（元/每位学生）
     */
     private BigDecimal commission;


}
