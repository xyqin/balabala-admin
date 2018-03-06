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
 * 2018年03月06日 04:53:27
 */
@Data
public abstract class AbstractBarablahClassGetDetailResponse {
    /**
     *
     * 开班ID
     */
     private Long id;

    /**
     *
     * 班级分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 课程ID
     */
    private LabelValueItem CourseIdObject = new LabelValueItem();

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
