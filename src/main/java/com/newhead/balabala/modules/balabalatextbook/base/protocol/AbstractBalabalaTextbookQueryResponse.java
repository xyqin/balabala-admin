package com.newhead.balabala.modules.balabalatextbook.base.protocol;

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
 * @generated 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 分类ID
     */
    private LabelValueItem CategoryIdObject = new LabelValueItem();

    /**
     *
     * 教材名称
     */
     private String textbookName;

}
