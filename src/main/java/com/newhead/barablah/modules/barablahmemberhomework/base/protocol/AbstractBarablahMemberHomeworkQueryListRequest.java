package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月13日 07:57:08
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
