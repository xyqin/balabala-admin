package com.newhead.barablah.modules.barablahcampus.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年01月18日 06:52:59
 */
@Data
public abstract class AbstractBarablahCampusGetDetailResponse {
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