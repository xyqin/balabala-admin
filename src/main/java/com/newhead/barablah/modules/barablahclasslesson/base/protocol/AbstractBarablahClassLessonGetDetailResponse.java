package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月18日 06:52:59
 */
@Data
public abstract class AbstractBarablahClassLessonGetDetailResponse {
    /**
     *
     * 课时ID
     */
     private Long id;

    /**
     *
     * 开班ID
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

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
     * 教材三级分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 外教教师ID
     */
    private LabelValueItem EnglishTeacherIdObject = new LabelValueItem();

    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 开始时间
     */
     private Date startAt;

    /**
     *
     * 结束时间
     */
     private Date endAt;

    /**
     *
     * 课时视频缩略图
     */
     private String thumbnail;

    /**
     *
     * 课时视频
     */
     private String video;

    /**
     *
     * 网易云房间
     */
     private String room;

    /**
     *
     * 是否备课
     */
     private Boolean prepared;

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();


}