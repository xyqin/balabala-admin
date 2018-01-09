package com.newhead.balabala.modules.balabalapositioncontent.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaPositionContentQueryPageRequest extends PageRequest {
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
