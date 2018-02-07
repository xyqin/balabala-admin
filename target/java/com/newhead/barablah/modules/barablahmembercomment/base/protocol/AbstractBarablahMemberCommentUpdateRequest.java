package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年02月07日 04:55:39
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
