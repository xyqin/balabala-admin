package com.newhead.balabala.modules.balabalamemberhomework.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月09日 04:35:23
 */
@Data
public abstract class AbstractBalabalaMemberHomeworkUpdateRequest {
    /**
     *
     * 主键
     */
    private Long id;
    /**
     *
     * 会员ID
     */
    private Long memberId;
    /**
     *
     * 教师ID
     */
    private Long teacherId;
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