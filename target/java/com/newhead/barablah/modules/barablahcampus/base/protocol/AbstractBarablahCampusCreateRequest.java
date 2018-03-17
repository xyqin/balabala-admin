package com.newhead.barablah.modules.barablahcampus.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

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
