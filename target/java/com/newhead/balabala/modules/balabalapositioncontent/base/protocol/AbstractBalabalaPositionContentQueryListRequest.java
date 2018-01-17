package com.newhead.balabala.modules.balabalapositioncontent.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月17日 05:42:35
 */
@Data
public abstract class AbstractBalabalaPositionContentQueryListRequest  {
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
