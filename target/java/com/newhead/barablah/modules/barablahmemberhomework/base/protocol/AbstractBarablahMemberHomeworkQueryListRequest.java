package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月26日 03:39:49
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
