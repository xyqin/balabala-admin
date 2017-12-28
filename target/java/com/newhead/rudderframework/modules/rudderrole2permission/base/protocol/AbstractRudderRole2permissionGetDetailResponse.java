package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 角色权限关系
 * 2017年12月28日 06:54:54
 */
@Data
public abstract class AbstractRudderRole2permissionGetDetailResponse {
    /**
     *
     * 资源ID
     */
     private Long id;

    /**
     *
     * 资源编码
     */
    private LabelValueItem RudderpermissionIdObject = new LabelValueItem();

    /**
     *
     * 角色
     */
    private LabelValueItem RudderroleIdObject = new LabelValueItem();

    /**
     *
     * 是否显示
     */
     private Boolean visible;


}
