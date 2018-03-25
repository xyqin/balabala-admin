package com.newhead.barablah.modules.barablahclass.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahClassQueryPageRequest extends PageRequest {
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
     * 开班状态
     */
     private String status;

}
