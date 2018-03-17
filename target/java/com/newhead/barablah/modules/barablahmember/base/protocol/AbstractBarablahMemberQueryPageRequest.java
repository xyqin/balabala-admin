package com.newhead.barablah.modules.barablahmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahMemberQueryPageRequest extends PageRequest {
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
     * 性别
     */
     private String gender;

    /**
     *
     * 状态
     */
     private String status;

}
