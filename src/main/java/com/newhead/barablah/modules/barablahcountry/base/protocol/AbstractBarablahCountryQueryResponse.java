package com.newhead.barablah.modules.barablahcountry.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahCountryQueryResponse {
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
