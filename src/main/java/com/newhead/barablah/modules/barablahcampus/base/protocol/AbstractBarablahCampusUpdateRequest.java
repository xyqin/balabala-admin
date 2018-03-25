package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahCampusUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 所属地区
     */
    private Long regionId;
    /**
     *
     * 校区名称
     */
    private String campusName;

}
