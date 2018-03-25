package com.newhead.barablah.modules.barablahteacher.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年03月25日 10:55:20
 */
@Data
public abstract class AbstractBarablahTeacherQueryPageRequest extends PageRequest {
    /**
     *
     * 所在校区
     */
     private Long campusId;

    /**
     *
     * 账号
     */
     private String username;

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
     private Long major;

    /**
     *
     * 国籍
     */
     private Long comeFrom;

    /**
     *
     * 状态
     */
     private String status;

}
