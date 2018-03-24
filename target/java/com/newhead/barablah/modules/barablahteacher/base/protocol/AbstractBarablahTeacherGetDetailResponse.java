package com.newhead.barablah.modules.barablahteacher.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月24日 04:28:59
 */
@Data
public abstract class AbstractBarablahTeacherGetDetailResponse {
    /**
     *
     * Id
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
