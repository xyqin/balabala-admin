package com.newhead.barablah.modules.barablahmember.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:22
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
