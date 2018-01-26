package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月26日 03:39:48
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
     * 课时视频缩略图
     */
     private String thumbnail;

    /**
     *
     * 课时视频
     */
     private String video;

    /**
     *
     * 网易云房间
     */
     private String room;

    /**
     *
     * 是否备课
     */
     private Boolean prepared;

    /**
     *
     * 类型
     */
     private String type;

}
