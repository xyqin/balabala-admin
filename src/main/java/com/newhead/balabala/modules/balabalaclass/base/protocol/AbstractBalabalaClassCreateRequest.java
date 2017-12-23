package com.newhead.balabala.modules.balabalaclass.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月23日 02:12:58
 */
@Data
public abstract class AbstractBalabalaClassCreateRequest {
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