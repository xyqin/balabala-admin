package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:27
 */
@Data
public abstract class AbstractBarablahCampusUpdateRequest {
    /**
     *
     * 校区ID
     */
    private Long id;
    /**
     *
     * 地区ID
     */
    private Long regionId;
    /**
     *
     * 校区名称
     */
    private String campusName;

}
