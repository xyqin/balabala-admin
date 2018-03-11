package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月11日 09:18:45
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
