package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahMemberUpdateRequest {
    /**
     *
     * 会员ID
     */
    private Long id;
    /**
     *
     * 校区ID
     */
    private Long campusId;
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
    private String gender;
    /**
     *
     * 生日
     */
    private String birthday;
    /**
     *
     * 状态
     */
    private String status;
    /**
     *
     * 积分
     */
    private Integer points;

}
