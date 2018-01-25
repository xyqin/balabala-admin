package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahClassLessonQueryPageRequest extends PageRequest {
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
