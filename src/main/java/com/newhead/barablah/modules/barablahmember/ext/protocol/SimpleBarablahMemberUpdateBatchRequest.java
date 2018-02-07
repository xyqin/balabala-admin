package com.newhead.barablah.modules.barablahmember.ext.protocol;

import lombok.Data;

import java.util.List;

@Data
public class SimpleBarablahMemberUpdateBatchRequest {

    private List<Long> memberIds;

    private String status;

}
