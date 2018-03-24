package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.util.Date;

/**
 * 
 * @generated 2018年03月24日 02:09:41
 */
@Data
public abstract class AbstractBarablahClassLessonQueryResponse {
    /**
     *
     * 课时ID
     */
     private Long id;

    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 班级
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

    /**
     *
     * 教材四级分类
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

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
     * 是否备课
     */
     private Boolean prepared;

    /**
     *
     * 类型
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

}
