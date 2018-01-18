package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月18日 06:52:59
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
     * 课程ID
     */
    private Long courseId;
    /**
     *
     * 教师ID
     */
    private Long teacherId;
    /**
     *
     * 教材三级分类ID
     */
    private Long categoryId;
    /**
     *
     * 外教教师ID
     */
    private Long englishTeacherId;
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
    private String type;

}
