package com.newhead.rudderframework.modules.ruddermenu.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 菜单
 * @generated 2017年05月07日 06:44:31
 */
@Data
public abstract class AbstractRudderMenuQueryPageRequest extends PageRequest {
    /**
     *
     * 菜单名称
     */
     private String ruddermenuName;

}
