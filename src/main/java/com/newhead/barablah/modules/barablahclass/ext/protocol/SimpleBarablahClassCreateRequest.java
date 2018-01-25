package com.newhead.barablah.modules.barablahclass.ext.protocol;

import com.newhead.barablah.modules.barablahclass.base.protocol.AbstractBarablahClassCreateRequest;
import lombok.Data;

/**
 * 2018年01月18日 06:52:58
 */
@Data
public class SimpleBarablahClassCreateRequest extends AbstractBarablahClassCreateRequest {

    private int onlineLessons;

    private int onlineDuration;

    private int offlineLessons;

    private int offlineDuration;

    private String startAtOnline;

    private String startAtOffline;

}
