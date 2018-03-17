package com.newhead.barablah.modules.barablahcampus.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:21
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
