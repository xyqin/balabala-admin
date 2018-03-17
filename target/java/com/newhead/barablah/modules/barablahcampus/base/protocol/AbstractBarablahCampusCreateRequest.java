package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:21
 */
@Data
public abstract class AbstractBarablahCampusCreateRequest {
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
