package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

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
 * @generated 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahMemberCommentQueryResponse {
    /**
     *
     * 主键
     */
     private Long id;

    /**
     *
     * 班级
     */
    private LabelValueItem ClassIdObject = new LabelValueItem();

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

    /**
     *
     * 学生作业
     */
    private LabelValueItem MemberHomeworkIdObject = new LabelValueItem();

    /**
     *
     * 性别
     */
    private LabelValueItem CommentTypeEnum = new LabelValueItem();

    /**
     *
     * 积分
     */
     private String score;

}
