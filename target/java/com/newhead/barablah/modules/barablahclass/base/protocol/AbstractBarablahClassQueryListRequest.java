package com.newhead.barablah.modules.barablahclass.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 05:08:27
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
     * 班级名称
     */
     private String className;

    /**
     *
     * 状态
     */
     private String status;

}
