package com.newhead.barablah.modules.barablahmemberlesson.base.protocol;

import com.newhead.rudderframework.core.web.component.pagination.PageRequest;
import lombok.Data;


/**
 * 
 * @generated 2018年03月18日 02:48:23
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
