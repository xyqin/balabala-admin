package com.newhead.barablah.modules.barablahcountry.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahCountryQueryPageRequest extends PageRequest {
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
