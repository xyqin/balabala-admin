package com.newhead.barablah.modules.barablahmemberlesson.base.protocol;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 
 * @generated 2018年01月18日 06:53:00
 */
@Data
public abstract class AbstractBarablahMemberLessonQueryListRequest  {
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