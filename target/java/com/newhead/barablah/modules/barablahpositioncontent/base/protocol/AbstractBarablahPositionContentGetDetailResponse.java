package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月11日 09:18:46
 */
@Data
public abstract class AbstractBarablahPositionContentGetDetailResponse {
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
