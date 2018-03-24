package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahMemberCommentCreateRequest {
    /**
     *
     * 班级
     */
    private Long classId;

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

    /**
     *
     * 学生作业
     */
    private Long memberHomeworkId;

    /**
     *
     * 性别
     */
    private String commentType;

    /**
     *
     * 积分
     */
    private String score;

}
