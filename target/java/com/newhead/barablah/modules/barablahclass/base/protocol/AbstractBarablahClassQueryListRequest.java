package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月22日 08:05:44
 */
@Data
public abstract class AbstractBarablahClassQueryListRequest  {
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
     * 课程ID
     */
     private Long courseId;

    /**
     *
     * 班级名称
     */
     private String className;

    /**
     *
     * 状态
     */
     private String status;

}
