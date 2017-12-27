package com.newhead.balabala.modules.balabalatextbook.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookGetDetailResponse {
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
