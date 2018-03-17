package com.newhead.barablah.modules.barablahtextbookcategory.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahTextbookCategoryQueryPageRequest extends PageRequest {
    /**
     *
     * 分类名称
     */
     private String categoryName;

}
