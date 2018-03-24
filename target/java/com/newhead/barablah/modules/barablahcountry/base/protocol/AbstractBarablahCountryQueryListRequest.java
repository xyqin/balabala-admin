package com.newhead.barablah.modules.barablahcountry.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahCountryQueryListRequest  {
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
