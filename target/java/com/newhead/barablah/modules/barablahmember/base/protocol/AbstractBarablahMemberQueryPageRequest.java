package com.newhead.barablah.modules.barablahmember.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年01月25日 03:24:35
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
     * 英文名
     */
     private String englishName;

    /**
     *
     * 性别
     */
     private String gender;

}
