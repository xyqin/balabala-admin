package com.newhead.barablah.modules.barablahcountry.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahCountryUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 英文名称
     */
    private String name;
    /**
     *
     * 中文名称
     */
    private String zhName;
    /**
     *
     * 缩写
     */
    private String code;
    /**
     *
     * 编码
     */
    private String code2;

}
