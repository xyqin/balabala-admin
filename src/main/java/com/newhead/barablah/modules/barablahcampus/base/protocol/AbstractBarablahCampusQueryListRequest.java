package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月25日 10:55:19
 */
@Data
public abstract class AbstractBarablahCampusQueryListRequest  {
    /**
     *
     * 所属地区
     */
     private Long regionId;

    /**
     *
     * 校区名称
     */
     private String campusName;

}
