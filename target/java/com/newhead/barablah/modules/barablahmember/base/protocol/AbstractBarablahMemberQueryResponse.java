package com.newhead.barablah.modules.barablahmember.base.protocol;

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
 * @generated 2018年02月06日 03:55:39
 */
@Data
public abstract class AbstractBarablahMemberQueryResponse {
    /**
     *
     * 会员ID
     */
     private Long id;

    /**
     *
     * 校区ID
     */
    private LabelValueItem CampusIdObject = new LabelValueItem();

    /**
     *
     * 昵称
     */
     private String nickname;

    /**
     *
     * 头像
     */
     private String avatar;

    /**
     *
     * 性别
     */
    private LabelValueItem GenderEnum = new LabelValueItem();

    /**
     *
     * 生日
     */
     private String birthday;

    /**
     *
     * 积分
     */
     private Integer points;

}
