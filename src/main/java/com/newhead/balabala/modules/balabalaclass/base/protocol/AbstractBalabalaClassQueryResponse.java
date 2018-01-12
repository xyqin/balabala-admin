package com.newhead.balabala.modules.balabalaclass.base.protocol;

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
 * @generated 2018年01月12日 04:41:38
 */
@Data
public abstract class AbstractBalabalaClassQueryResponse {
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
     * 校区ID
     */
    private LabelValueItem CampusIdObject = new LabelValueItem();

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
