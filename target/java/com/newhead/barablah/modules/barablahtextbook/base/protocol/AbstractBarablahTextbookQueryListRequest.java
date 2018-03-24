package com.newhead.barablah.modules.barablahtextbook.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahTextbookQueryListRequest  {
    /**
     *
     * 教材四级分类
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
