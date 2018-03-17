package com.newhead.rudderframework.modules.ruddermenu2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 菜单权限关系
 * @generated 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderMenu2permissionQueryResponse {
    /**
     *
     * 资源ID
     */
     private Long id;

    /**
     *
     * 菜单
     */
    private LabelValueItem RuddermenuIdObject = new LabelValueItem();

    /**
     *
     * 资源编码
     */
    private LabelValueItem RudderpermissionIdObject = new LabelValueItem();

    /**
     *
     * 是否显示
     */
     private Boolean visible;

}
