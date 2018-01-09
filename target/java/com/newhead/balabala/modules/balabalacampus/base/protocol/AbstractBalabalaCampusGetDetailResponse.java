package com.newhead.balabala.modules.balabalacampus.base.protocol;

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
public abstract class AbstractBalabalaCampusGetDetailResponse {
    /**
     *
     * 校区ID
     */
     private Long id;

    /**
     *
     * 地区ID
     */
    private LabelValueItem RegionIdObject = new LabelValueItem();

    /**
     *
     * 校区名称
     */
     private String campusName;


}
