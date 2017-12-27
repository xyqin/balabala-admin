package com.newhead.balabala.modules.balabalatextbookcategory.base.protocol;

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
public abstract class AbstractBalabalaTextbookCategoryUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 父ID
     */
    private Long parentId;
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

}
