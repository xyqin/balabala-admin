package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahClassLessonQueryListRequest  {
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
     * 课时状态
     */
     private String status;

    /**
     *
     * 类型
     */
     private String type;

}
