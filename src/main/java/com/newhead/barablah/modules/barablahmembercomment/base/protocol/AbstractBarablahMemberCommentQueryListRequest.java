package com.newhead.barablah.modules.barablahmembercomment.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年03月24日 01:24:55
 */
@Data
public abstract class AbstractBarablahMemberCommentQueryListRequest  {
    /**
     *
     * 班级
     */
     private Integer classId;

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
