package com.newhead.sc.modules.scdevice.ext.protocol;

import com.newhead.sc.modules.scdevice.base.protocol.AbstractScDeviceQueryResponse;
import lombok.Data;

/**
 * 2017年12月13日 12:17:48
 */
@Data
public class SimpleScDeviceQueryResponse extends AbstractScDeviceQueryResponse {

    private String type;

}
