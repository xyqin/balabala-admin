package com.newhead.balabala.modules.balabalatextbook.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 12:00:29
 */
@Data
public abstract class AbstractBalabalaTextbookCreateRequest {
    /**
     *
     * 分类ID
     */
    private Long categoryId;

    /**
     *
     * 教材名称
     */
    private String textbookName;

}
