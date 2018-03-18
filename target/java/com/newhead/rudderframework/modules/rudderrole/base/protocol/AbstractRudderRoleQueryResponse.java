package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import com.newhead.rudderframework.core.web.component.tree.Tree;
import lombok.Data;

/**
 * 系统角色
 * @generated 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractRudderRoleQueryResponse {
    /**
     *
     * 角色ID
     */
     private Long id;

    /**
     *
     * 资源名称
     */
     private String rudderroleName;

    /**
     *
     * 资源描述
     */
     private String rudderroleDesc;

    /**
     *
     * 角色代码
     */
     private String code;

    /**
     *
     * 是否显示
     */
     private Boolean visible;

     private Tree rudderPermissionItems = new Tree();

}
