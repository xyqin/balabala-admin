package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * 2018年03月23日 02:01:56
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
     * 校区ID
     */
    private Long campusId;

    /**
     *
     * 线上教师
     */
    private Long teacherId;

    /**
     *
     * 课程分类
     */
    private Long courseCatId;

    /**
     *
     * 课程ID
     */
    private Long courseId;

    /**
     *
     * 线下教师
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
     * 状态
     */
    private String status;

}
