package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月24日 04:28:59
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
     * 课时名称
     */
    private String lessonName;
    /**
     *
     * 班级
     */
    private Long classId;
    /**
     *
     * 教材四级分类
     */
    private Long categoryId;
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
    private String status;
    /**
     *
     * 类型
     */
    private String type;

}
