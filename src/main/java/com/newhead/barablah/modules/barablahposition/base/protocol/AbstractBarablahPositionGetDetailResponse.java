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
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahPositionGetDetailResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 位置名称
     */
     private String positionName;


}
