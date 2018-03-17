package com.newhead.barablah.modules.barablahteacher.base.protocol;

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
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahTeacherQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 校区
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
    private LabelValueItem MajorObject = new LabelValueItem();

    /**
     *
     * 国籍
     */
    private LabelValueItem ComeFromObject = new LabelValueItem();

    /**
     *
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

}
