package com.newhead.rudderframework.modules.rudderuser.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 系统用户
 * 2018年03月06日 04:53:29
 */
@Data
public abstract class AbstractRudderUserGetDetailResponse {
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

    /**
     *
     * 校区ID
     */
    private LabelValueItem CampusIdObject = new LabelValueItem();

    private List<LabelValueItem> rudderRoleItems = new ArrayList<>();


}
