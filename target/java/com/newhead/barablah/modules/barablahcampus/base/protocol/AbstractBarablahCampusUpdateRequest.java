package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 04:00:58
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
