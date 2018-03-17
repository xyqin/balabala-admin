package com.newhead.barablah.modules.barablahposition.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahPositionGetDetailResponse {
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
