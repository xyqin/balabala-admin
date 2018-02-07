package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年02月07日 04:55:39
 */
@Data
public abstract class AbstractBarablahTextbookQueryPageRequest extends PageRequest {
    /**
     *
     * 教材三级分类ID
     */
     private Long categoryId;

    /**
     *
     * 题目类型
     */
     private String type;

    /**
     *
     * 题目名称
     */
     private String textbookName;

}
