package com.newhead.barablah.modules.barablahclass.base.protocol;

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
public abstract class AbstractBarablahClassCreateRequest {
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