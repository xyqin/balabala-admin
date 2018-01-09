package com.newhead.balabala.modules.balabalaposition.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaPositionGetDetailResponse {
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
