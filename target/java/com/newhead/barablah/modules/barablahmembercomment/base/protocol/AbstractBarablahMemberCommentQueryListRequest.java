package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月24日 04:29:00
 */
@Data
public abstract class AbstractBarablahMemberCommentQueryListRequest  {
    /**
     *
     * 班级
     */
     private Long classId;

    /**
     *
     * 评语内容
     */
     private String content;

    /**
     *
     * 性别
     */
     private String commentType;

}
