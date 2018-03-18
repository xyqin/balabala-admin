package com.newhead.barablah.modules.barablahposition.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahPositionUpdateRequest {
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
