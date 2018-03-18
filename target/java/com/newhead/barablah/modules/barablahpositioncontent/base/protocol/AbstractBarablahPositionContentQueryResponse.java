package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.util.Date;

/**
 * 
 * @generated 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahPositionContentQueryResponse {
    /**
     *
     * 内容ID
     */
     private Long id;

    /**
     *
     * 位置ID
     */
    private LabelValueItem PositionIdObject = new LabelValueItem();

    /**
     *
     * 内容名称
     */
     private String contentName;

    /**
     *
     * 内容图片
     */
     private String image;

    /**
     *
     * 内容链接地址
     */
     private String link;

    /**
     *
     * 开始时间
     */
     private Date startAt;

    /**
     *
     * 结束时间
     */
     private Date endAt;

    /**
     *
     * 排序号
     */
     private Integer position;

}
