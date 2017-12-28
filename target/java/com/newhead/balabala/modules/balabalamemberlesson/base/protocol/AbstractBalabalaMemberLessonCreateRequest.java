package com.newhead.balabala.modules.balabalamemberlesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2017年12月28日 03:59:21
 */
@Data
public abstract class AbstractBalabalaMemberLessonCreateRequest {
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
