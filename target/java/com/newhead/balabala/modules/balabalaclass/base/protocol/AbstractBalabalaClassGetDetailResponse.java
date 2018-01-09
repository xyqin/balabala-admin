package com.newhead.balabala.modules.balabalaclass.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaClassGetDetailResponse {
    /**
     *
     * 开班ID
     */
     private Long id;

    /**
     *
     * 课程ID
     */
    private LabelValueItem CourseIdObject = new LabelValueItem();

    /**
     *
     * 一级分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 教师ID
     */
    private LabelValueItem TeacherIdObject = new LabelValueItem();

    /**
     *
     * 外教教师ID
     */
    private LabelValueItem EnglishTeacherIdObject = new LabelValueItem();

    /**
     *
     * 班级名称
     */
     private String className;

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
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();


}
