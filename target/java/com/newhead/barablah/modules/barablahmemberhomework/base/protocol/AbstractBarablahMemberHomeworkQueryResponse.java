package com.newhead.barablah.modules.barablahmemberhomework.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahMemberHomeworkQueryResponse {
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
     * 作业名称
     */
     private String homeworkName;

    /**
     *
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();

}
