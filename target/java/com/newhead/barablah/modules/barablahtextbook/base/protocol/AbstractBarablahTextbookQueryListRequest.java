package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月26日 11:59:31
 */
@Data
public abstract class AbstractBarablahTextbookQueryListRequest  {
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
