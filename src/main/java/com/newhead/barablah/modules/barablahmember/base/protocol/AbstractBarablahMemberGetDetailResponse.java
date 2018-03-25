package com.newhead.barablah.modules.barablahmember.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import java.math.BigDecimal;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahMemberGetDetailResponse {
    /**
     *
     * ID
     */
     private Long id;

    /**
     *
     * 所在校区
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
     * 英文名
     */
     private String englishName;

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
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

    /**
     *
     * 积分
     */
     private Integer points;


}
