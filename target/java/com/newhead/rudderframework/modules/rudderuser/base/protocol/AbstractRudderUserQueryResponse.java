package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 系统用户
 * @generated 2017年12月28日 03:59:21
 */
@Data
public abstract class AbstractRudderUserQueryResponse {
    /**
     *
     * 资源ID
     */
     private Long id;

    /**
     *
     * 账号名称
     */
     private String rudderuserName;

    /**
     *
     * 备注
     */
     private String rudderuserDesc;

    /**
     *
     * 密码
     */
     private String password;

    /**
     *
     * 用户状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

    /**
     *
     * 昵称
     */
     private String nickname;

    /**
     *
     * salt
     */
     private String salt;

    /**
     *
     * email
     */
     private String email;

    /**
     *
     * 是否显示
     */
     private Boolean visible;

     private List<LabelValueItem> rudderRoleItems = new ArrayList<>();

}
