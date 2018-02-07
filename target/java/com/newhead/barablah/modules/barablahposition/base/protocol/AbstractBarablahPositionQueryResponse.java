package com.newhead.barablah.modules.barablahposition.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年02月07日 04:55:39
 */
@Data
public abstract class AbstractBarablahPositionQueryResponse {
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
