package com.newhead.barablah.modules.barablahclass.base.protocol;

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
public abstract class AbstractBarablahClassUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 班级类别
     */
    private Long categoryId;
    /**
     *
     * 所在校区
     */
    private Long campusId;
    /**
     *
     * 课程类别
     */
    private Long courseCatId;
    /**
     *
     * 所属课程
     */
    private Long courseId;
    /**
     *
     * 班级名称
     */
    private String className;
    /**
     *
     * 线上教师
     */
    private Long teacherId;
    /**
     *
     * 线下教师
     */
    private Long englishTeacherId;
    /**
     *
     * 班长
     */
    @NotEmpty(message="barablahClass班长不能为空")
    private String monitor;
    /**
     *
     * 班长电话
     */
    @NotEmpty(message="barablahClass班长电话不能为空")
    private String monitorPhoneNumber;
    /**
     *
     * 开班状态
     */
    private String status;

}
