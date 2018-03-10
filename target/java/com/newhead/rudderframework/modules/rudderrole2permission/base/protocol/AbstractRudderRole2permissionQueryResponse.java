package com.newhead.rudderframework.modules.rudderrole2permission.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 角色权限关系
 * @generated 2018年03月06日 04:53:29
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
