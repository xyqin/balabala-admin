package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月26日 11:59:31
 */
@Data
public abstract class AbstractBarablahPositionContentQueryListRequest  {
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

}
