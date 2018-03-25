package com.newhead.barablah.modules.barablahclass.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahClassGetDetailResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 班级类别
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 所在校区
     */
    private LabelValueItem CampusIdObject = new LabelValueItem();

    /**
     *
     * 课程类别
     */
    private LabelValueItem CourseCatIdObject = new LabelValueItem();

    /**
     *
     * 所属课程
     */
    private LabelValueItem CourseIdObject = new LabelValueItem();

    /**
     *
     * 班级名称
     */
     private String className;

    /**
     *
     * 线上教师
     */
    private LabelValueItem TeacherIdObject = new LabelValueItem();

    /**
     *
     * 线下教师
     */
    private LabelValueItem EnglishTeacherIdObject = new LabelValueItem();

    /**
     *
     * 班长
     */
     private String monitor;

    /**
     *
     * 班长电话
     */
     private String monitorPhoneNumber;

    /**
     *
     * 开班状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();


}
