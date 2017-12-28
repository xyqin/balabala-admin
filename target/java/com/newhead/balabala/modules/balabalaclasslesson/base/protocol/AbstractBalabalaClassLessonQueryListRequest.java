package com.newhead.balabala.modules.balabalaclasslesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2017年12月28日 07:22:04
 */
@Data
public abstract class AbstractBalabalaClassLessonQueryListRequest  {
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

}
