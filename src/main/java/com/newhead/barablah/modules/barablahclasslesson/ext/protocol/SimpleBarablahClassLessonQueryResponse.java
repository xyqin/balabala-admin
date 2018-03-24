package com.newhead.barablah.modules.barablahclasslesson.ext.protocol;

import com.newhead.barablah.modules.barablahclasslesson.base.protocol.AbstractBarablahClassLessonQueryResponse;
import lombok.Data;

/**
 * 
 * 2018年01月18日 06:52:58
 */
@Data
public class SimpleBarablahClassLessonQueryResponse extends AbstractBarablahClassLessonQueryResponse {
    private String week;

    private String during;

}
