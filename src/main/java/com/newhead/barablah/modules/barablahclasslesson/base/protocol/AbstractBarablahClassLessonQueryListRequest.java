package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月24日 02:09:41
 */
@Data
public abstract class AbstractBarablahClassLessonQueryListRequest  {
    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 班级
     */
     private Long classId;

    /**
     *
     * 类型
     */
     private String status;

    /**
     *
     * 类型
     */
     private String type;

}
