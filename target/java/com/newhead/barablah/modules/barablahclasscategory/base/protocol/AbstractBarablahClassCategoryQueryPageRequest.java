package com.newhead.barablah.modules.barablahclasscategory.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月11日 09:18:44
 */
@Data
public abstract class AbstractBarablahClassCategoryQueryPageRequest extends PageRequest {
    /**
     *
     * 分类名称
     */
     private String categoryName;

}
