package com.newhead.balabala.modules.balabalatextbookcategory.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月28日 05:00:58
 */
@Data
public abstract class AbstractBalabalaTextbookCategoryGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 父ID
     */
    private LabelValueItem ParentIdObject = new LabelValueItem();

    /**
     *
     * 分类名称
     */
     private String categoryName;

    /**
     *
     * 分类路径
     */
     private String path;

    /**
     *
     * 排序号
     */
     private Integer position;


}
