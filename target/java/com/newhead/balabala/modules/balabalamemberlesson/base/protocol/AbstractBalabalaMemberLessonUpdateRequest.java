package com.newhead.balabala.modules.balabalamemberlesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月24日 12:57:58
 */
@Data
public abstract class AbstractBalabalaMemberLessonUpdateRequest {
    /**
     *
     * 会员ID
     */
    private Long id;
    /**
     *
     * 会员ID
     */
    private Long memberId;
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
     * 开始时间
     */
    private Date startAt;
    /**
     *
     * 结束时间
     */
    private Date endAt;

}
