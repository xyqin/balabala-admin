package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月06日 04:53:28
 */
@Data
public abstract class AbstractBarablahClassLessonCreateRequest {
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
