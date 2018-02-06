package com.newhead.barablah.modules.barablahposition.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月06日 05:24:57
 */
@Data
public abstract class AbstractBarablahPositionCreateRequest {
    /**
     *
     * 位置名称
     */
    private String positionName;

}
