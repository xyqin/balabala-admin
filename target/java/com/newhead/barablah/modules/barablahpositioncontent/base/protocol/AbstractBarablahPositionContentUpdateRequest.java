package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahPositionContentUpdateRequest {
    /**
     *
     * 内容ID
     */
    private Long id;
    /**
     *
     * 位置ID
     */
    private Long positionId;
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
