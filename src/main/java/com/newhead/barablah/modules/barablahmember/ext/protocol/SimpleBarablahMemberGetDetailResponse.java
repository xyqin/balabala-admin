package com.newhead.barablah.modules.barablahmember.ext.protocol;

import com.newhead.barablah.modules.barablahmember.base.protocol.AbstractBarablahMemberGetDetailResponse;
import lombok.Data;

/**
 * 2018年02月07日 04:55:37
 */
@Data
public class SimpleBarablahMemberGetDetailResponse extends AbstractBarablahMemberGetDetailResponse {

    private String phoneNumber;

}
