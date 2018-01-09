package com.newhead.balabala.modules.balabalaposition.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaPositionUpdateRequest {
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
