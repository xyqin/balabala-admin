package com.newhead.barablah.modules.barablahteacher.ext.protocol;

import com.newhead.barablah.modules.barablahteacher.base.protocol.AbstractBarablahTeacherQueryListRequest;
import lombok.Data;

/**
 * 
 * 2018年01月18日 06:52:59
 */
@Data
public class SimpleBarablahTeacherQueryListRequest extends AbstractBarablahTeacherQueryListRequest {
    private long area;

}
