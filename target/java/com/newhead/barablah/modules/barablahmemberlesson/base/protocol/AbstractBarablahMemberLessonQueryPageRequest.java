package com.newhead.barablah.modules.barablahmemberlesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;


/**
 * 
 * @generated 2018年02月06日 03:58:39
 */
@Data
public abstract class AbstractBarablahMemberLessonQueryPageRequest extends PageRequest {
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
