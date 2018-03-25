package com.newhead.barablah.modules.barablahmember.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahMemberUpdateRequest {
    /**
     *
     * ID
     */
    private Long id;
    /**
     *
     * 所在校区
     */
    private Long campusId;
    /**
     *
     * 昵称
     */
    @NotEmpty(message="barablahMember昵称不能为空")
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
    @NotEmpty(message="barablahMember英文名不能为空")
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
    @NotEmpty(message="barablahMember生日不能为空")
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
