package com.newhead.balabala.modules.balabalamemberlesson.base.protocol;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import java.util.Date;
import java.math.BigDecimal;

import javax.validation.constraints.Size;

/**
 * 
 * 2018年01月08日 05:02:06
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
    /**
     *
     * 类型
     */
    private String type;
    /**
     *
     * 是否试听
     */
    private Boolean probational;

}
