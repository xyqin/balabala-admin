package com.newhead.barablah.modules.barablahmember.ext.protocol;

import com.newhead.barablah.modules.barablahmember.base.protocol.AbstractBarablahMemberUpdateRequest;
import lombok.Data;

/**
 * 2018年02月07日 04:55:37
 */
@Data
public class SimpleBarablahMemberUpdateRequest extends AbstractBarablahMemberUpdateRequest {

    private String phoneNumber;

    private String password;

    private String accid;

    private String token;

}
