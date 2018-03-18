package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:29
 */
@Data
public abstract class AbstractBarablahMemberHomeworkUpdateRequest {
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
