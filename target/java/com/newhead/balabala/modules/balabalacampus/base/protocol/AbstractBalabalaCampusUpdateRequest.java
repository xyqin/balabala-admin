package com.newhead.balabala.modules.balabalacampus.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 01:55:49
 */
@Data
public abstract class AbstractBalabalaCampusUpdateRequest {
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
