package com.newhead.barablah.modules.barablahposition.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractBarablahPositionCreateRequest {
    /**
     *
     * 位置名称
     */
    private String positionName;

}
