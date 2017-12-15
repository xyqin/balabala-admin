package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 角色权限关系
 * @generated 2017年05月07日 06:44:32
 */
@Data
public abstract class AbstractRudderRole2permissionQueryResponse {
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
