package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 10:47:08
 */
@Data
public abstract class AbstractBarablahClassCreateRequest {
    /**
     *
     * 班级分类ID
     */
    private Long categoryId;

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
     * 校区ID
     */
    private Long campusId;

    /**
     *
     * 外教教师ID
     */
    private Long englishTeacherId;

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
    private String status;

}
