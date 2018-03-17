package com.newhead.barablah.modules.barablahmemberlesson.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

import java.util.Date;

/**
 * 
 * @generated 2018年03月18日 02:48:23
 */
@Data
public abstract class AbstractBarablahMemberLessonQueryResponse {
    /**
     *
     * 会员ID
     */
     private Long id;

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 开班ID
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

    /**
     *
     * 课时ID
     */
    private LabelValueItem LessonIdObject = new LabelValueItem();

    /**
     *
     * 开始时间
     */
     private Date startAt;

    /**
     *
     * 结束时间
     */
     private Date endAt;

    /**
     *
     * 类型
     */
    private LabelValueItem TypeEnum = new LabelValueItem();

    /**
     *
     * 是否试听
     */
     private Boolean probational;

}
