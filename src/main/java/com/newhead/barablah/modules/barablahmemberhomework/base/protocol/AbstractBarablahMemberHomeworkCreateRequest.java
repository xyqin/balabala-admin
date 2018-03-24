package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月24日 01:24:55
 */
@Data
public abstract class AbstractBarablahMemberHomeworkCreateRequest {
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

    /**
     *
     * 开班ID
     */
    private Long classId;

}
