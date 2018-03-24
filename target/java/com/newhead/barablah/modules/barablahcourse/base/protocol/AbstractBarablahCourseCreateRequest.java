package com.newhead.barablah.modules.barablahcourse.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月24日 04:28:59
 */
@Data
public abstract class AbstractBarablahCourseCreateRequest {
    /**
     *
     * 课程分类ID
     */
    private Long categoryId;

    /**
     *
     * 教材三级分类
     */
    private Long textbookCategoryId;

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
