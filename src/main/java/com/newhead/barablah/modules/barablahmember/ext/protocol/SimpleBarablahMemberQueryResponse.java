package com.newhead.barablah.modules.barablahmember.ext.protocol;

import com.newhead.barablah.modules.barablahmember.base.protocol.AbstractBarablahMemberQueryResponse;
import lombok.Data;

/**
 * 2018年02月07日 04:55:37
 */
@Data
public class SimpleBarablahMemberQueryResponse extends AbstractBarablahMemberQueryResponse {

    private String phoneNumber;

}
