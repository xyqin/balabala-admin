package com.newhead.barablah.modules.barablahmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月26日 11:59:31
 */
@Data
public abstract class AbstractBarablahMemberQueryPageRequest extends PageRequest {
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

}
