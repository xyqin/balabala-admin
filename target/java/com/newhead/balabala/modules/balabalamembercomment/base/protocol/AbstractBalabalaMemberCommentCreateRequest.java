package com.newhead.balabala.modules.balabalamembercomment.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 06:54:54
 */
@Data
public abstract class AbstractBalabalaMemberCommentCreateRequest {
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
