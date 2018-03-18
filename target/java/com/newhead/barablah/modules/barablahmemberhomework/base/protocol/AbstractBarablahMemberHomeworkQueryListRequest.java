package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahMemberHomeworkQueryListRequest  {
    /**
     *
     * 作业名称
     */
     private String homeworkName;

    /**
     *
     * 状态
     */
     private String status;

}
