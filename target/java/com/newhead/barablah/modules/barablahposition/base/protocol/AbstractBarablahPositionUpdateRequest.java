package com.newhead.barablah.modules.barablahposition.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月26日 03:43:31
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
