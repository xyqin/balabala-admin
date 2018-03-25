package com.newhead.barablah.modules.barablahclasslesson.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahClassLessonGetDetailResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 班级
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

    /**
     *
     * 课时名称
     */
     private String lessonName;

    /**
     *
     * 配套教材
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 开课时间
     */
     private Date startAt;

    /**
     *
     * 结束时间
     */
     private Date endAt;

    /**
     *
     * 视频预览
     */
     private String thumbnail;

    /**
     *
     * 备课情况
     */
     private Boolean prepared;

    /**
     *
     * 课时状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();


}
