package com.newhead.barablah.modules.barablahmemberlessonlog.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年03月25日 10:55:21
 */
@Data
public abstract class AbstractBarablahMemberLessonlogCreateRequest {
    /**
     *
     * 开班ID
     */
    private Long classId;

    /**
     *
     * 课时ID
     */
    private Long lessonId;

    /**
     *
     * 会员ID
     */
    private Long memberId;

    /**
     *
     * 动作时间
     */
    private Date eventAt;

    /**
     *
     * 类型
     */
    private String action;

}
