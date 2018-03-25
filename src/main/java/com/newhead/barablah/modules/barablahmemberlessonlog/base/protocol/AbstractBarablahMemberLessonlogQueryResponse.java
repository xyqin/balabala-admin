package com.newhead.barablah.modules.barablahmemberlessonlog.base.protocol;

import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import java.util.Date;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import com.newhead.rudderframework.core.web.component.tree.Tree;

import lombok.Data;

/**
 * 
 * @generated 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahMemberLessonlogQueryResponse {
    /**
     *
     * 会员ID
     */
     private Long id;

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
     * 会员ID
     */
    private LabelValueItem MemberIdObject = new LabelValueItem();

    /**
     *
     * 动作时间
     */
     private Date eventAt;

    /**
     *
     * 类型
     */
    private LabelValueItem ActionEnum = new LabelValueItem();

}
