package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahClassLessonUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 班级
     */
    private Long classId;
    /**
     *
     * 课时名称
     */
    private String lessonName;
    /**
     *
     * 配套教材
     */
    private Long categoryId;
    /**
     *
     * 开课时间
     */
    private Date startAt;
    /**
     *
     * 结束时间
     */
    private Date endAt;
    /**
     *
     * 视频预览
     */
    private String thumbnail;
    /**
     *
     * 备课情况
     */
    private Boolean prepared;
    /**
     *
     * 课时状态
     */
    private String status;
    /**
     *
     * 类型
     */
    private String type;

}
