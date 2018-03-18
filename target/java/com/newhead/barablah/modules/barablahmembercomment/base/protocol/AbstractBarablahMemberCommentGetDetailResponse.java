package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * 2018年03月18日 05:08:28
 */
@Data
public abstract class AbstractBarablahMemberCommentGetDetailResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 教师ID
     */
    private LabelValueItem TeacherIdObject = new LabelValueItem();

    /**
     *
     * 评语内容
     */
     private String content;


}
