package com.newhead.barablah.modules.barablahposition.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月25日 03:24:35
 */
@Data
public abstract class AbstractBarablahPositionGetDetailResponse {
    /**
     *
     * 位置ID
     */
     private Long id;

    /**
     *
     * 位置名称
     */
     private String positionName;


}