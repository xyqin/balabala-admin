package com.newhead.balabala.modules.balabalaclasslesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2017年12月28日 01:55:49
 */
@Data
public abstract class AbstractBalabalaClassLessonQueryPageRequest extends PageRequest {
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

}
