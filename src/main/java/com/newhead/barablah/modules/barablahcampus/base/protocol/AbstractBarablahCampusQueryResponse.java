package com.newhead.barablah.modules.barablahcampus.base.protocol;

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
 * @generated 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahCampusQueryResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 所属地区
     */
    private LabelValueItem RegionIdObject = new LabelValueItem();

    /**
     *
     * 校区名称
     */
     private String campusName;

}
