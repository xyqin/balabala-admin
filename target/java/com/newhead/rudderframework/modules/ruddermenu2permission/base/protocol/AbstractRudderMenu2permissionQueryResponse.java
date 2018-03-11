package com.newhead.rudderframework.modules.ruddermenu2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 菜单权限关系
 * @generated 2018年03月11日 09:42:04
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
