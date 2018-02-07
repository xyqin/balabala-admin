package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年02月07日 04:00:58
 */
@Data
public abstract class AbstractBarablahClassMemberQueryListRequest  {
    /**
     *
     * 开班ID
     */
     private Long classId;

    /**
     *
     * 会员ID
     */
     private Long memberId;

    /**
     *
     * 状态
     */
     private String status;

}
