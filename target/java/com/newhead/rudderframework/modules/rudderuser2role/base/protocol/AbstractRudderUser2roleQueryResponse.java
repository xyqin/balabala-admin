package com.newhead.rudderframework.modules.rudderuser2role.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 用户角色关系
 * @generated 2018年03月18日 02:48:24
 */
@Data
public abstract class AbstractRudderUser2roleQueryResponse {
    /**
     *
     * 资源ID
     */
     private Long id;

    /**
     *
     * 角色
     */
    private LabelValueItem RudderroleIdObject = new LabelValueItem();

    /**
     *
     * 用户
     */
    private LabelValueItem RudderuserIdObject = new LabelValueItem();

    /**
     *
     * 是否显示
     */
     private Boolean visible;

}
