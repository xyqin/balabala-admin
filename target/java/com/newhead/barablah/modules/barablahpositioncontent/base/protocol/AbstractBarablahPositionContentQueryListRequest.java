package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahPositionContentQueryListRequest  {
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

}
