package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahMemberCommentUpdateRequest {
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
     * 评语内容
     */
    private String content;

}
