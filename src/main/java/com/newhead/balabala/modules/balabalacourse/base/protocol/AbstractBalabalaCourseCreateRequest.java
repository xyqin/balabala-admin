package com.newhead.balabala.modules.balabalacourse.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月23日 02:12:58
 */
@Data
public abstract class AbstractBalabalaCourseCreateRequest {
    /**
     *
     * 课程分类ID
     */
    private Long categoryId;

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