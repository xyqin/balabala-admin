package com.newhead.barablah.modules.barablahclass.ext.protocol;

import com.newhead.barablah.modules.barablahclass.base.protocol.AbstractBarablahClassQueryPageRequest;
import lombok.Data;

/**
 * 
 * 2018年01月18日 06:52:58
 */
@Data
public class SimpleBarablahClassQueryPageRequest extends AbstractBarablahClassQueryPageRequest {
    private String monitor;

    private String monitorPhoneNumber;
}

