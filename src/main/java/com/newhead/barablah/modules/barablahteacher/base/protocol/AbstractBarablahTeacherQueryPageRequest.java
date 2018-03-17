package com.newhead.barablah.modules.barablahteacher.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahTeacherQueryPageRequest extends PageRequest {
    /**
     *
     * 校区
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
