package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;

import java.util.Date;

/**
 * 
 * 2018年03月18日 02:48:21
 */
@Data
public abstract class AbstractBarablahClassLessonUpdateRequest {
    /**
     *
     * 课时ID
     */
    private Long id;
    /**
     *
     * 开班ID
     */
    private Long classId;
    /**
     *
     * 教材三级分类ID
     */
    private Long categoryId;
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
    private String type;

}
