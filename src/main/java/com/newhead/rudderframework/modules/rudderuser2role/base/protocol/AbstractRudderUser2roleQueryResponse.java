package com.newhead.rudderframework.modules.rudderuser2role.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 用户角色关系
 * @generated 2017年05月07日 06:44:32
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
