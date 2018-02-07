package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年02月07日 10:47:09
 */
@Data
public abstract class AbstractBarablahClassLessonQueryListRequest  {
    /**
     *
     * 开班ID
     */
     private Long classId;

    /**
     *
     * 教师ID
     */
     private Long teacherId;

    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 类型
     */
     private String type;

}
