package com.newhead.barablah.modules.barablahregion.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahRegionGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 上级ID
     */
    private LabelValueItem ParentIdObject = new LabelValueItem();

    /**
     *
     * 地区名称
     */
     private String regionName;

    /**
     *
     * 地区路径，以分隔
     */
     private String path;

    /**
     *
     * 排序号
     */
     private Integer position;

    /**
     *
     * 资源地址
     */
     private String url;


}
