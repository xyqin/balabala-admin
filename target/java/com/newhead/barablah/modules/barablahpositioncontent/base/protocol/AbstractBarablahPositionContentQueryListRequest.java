package com.newhead.barablah.modules.barablahpositioncontent.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年02月07日 04:55:39
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
