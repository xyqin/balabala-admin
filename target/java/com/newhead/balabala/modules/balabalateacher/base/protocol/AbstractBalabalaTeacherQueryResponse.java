package com.newhead.balabala.modules.balabalateacher.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2017年12月28日 03:59:21
 */
@Data
public abstract class AbstractBalabalaTeacherQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 校区ID
     */
    private LabelValueItem CampusIdObject = new LabelValueItem();

    /**
     *
     * 账号
     */
     private String username;

    /**
     *
     * 密码
     */
     private String password;

    /**
     *
     * 头像
     */
     private String avatar;

    /**
     *
     * 姓名
     */
     private String fullName;

    /**
     *
     * 手机号
     */
     private String phoneNumber;

    /**
     *
     * 专业
     */
     private String major;

    /**
     *
     * 来自哪里
     */
     private String comeFrom;

    /**
     *
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

    /**
     *
     * 网易云ID
     */
     private String accid;

    /**
     *
     * 网易云登录token
     */
     private String token;

}
