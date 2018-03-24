package com.newhead.rudderframework.modules.ruddermenu2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 菜单权限关系
 * 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractRudderMenu2permissionGetDetailResponse {
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
