package com.newhead.barablah.modules.barablahclassmember.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import lombok.Data;

/**
 * 
 * 2018年03月18日 02:48:22
 */
@Data
public abstract class AbstractBarablahClassMemberGetDetailResponse {
    /**
     *
     * 开班会员ID
     */
     private Long id;

    /**
     *
     * 开班ID
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

    /**
     *
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 状态
     */
    private LabelValueItem StatusEnum = new LabelValueItem();


}
