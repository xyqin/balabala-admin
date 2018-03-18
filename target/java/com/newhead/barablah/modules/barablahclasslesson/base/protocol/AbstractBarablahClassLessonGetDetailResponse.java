package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.util.Date;

/**
 * 
 * 2018年03月18日 05:08:27
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
     * 教材三级分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

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
     * 是否备课
     */
     private Boolean prepared;

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();


}
