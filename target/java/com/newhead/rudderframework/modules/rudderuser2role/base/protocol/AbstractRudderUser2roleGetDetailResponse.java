package com.newhead.rudderframework.modules.rudderuser2role.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 用户角色关系
 * 2018年02月07日 04:55:39
 */
@Data
public abstract class AbstractRudderUser2roleGetDetailResponse {
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
