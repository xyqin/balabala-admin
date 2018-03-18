package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月18日 05:08:27
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
     * 教师ID
     */
    private Long teacherId;

    /**
     *
     * 课程ID
     */
    private Long courseId;

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
