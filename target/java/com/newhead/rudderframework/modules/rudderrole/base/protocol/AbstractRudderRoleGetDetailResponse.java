package com.newhead.rudderframework.modules.rudderrole.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 系统角色
 * 2017年12月23日 02:12:59
 */
@Data
public abstract class AbstractRudderRoleGetDetailResponse {
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