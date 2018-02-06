package com.newhead.barablah.modules.barablahteacher.ext.protocol;

import lombok.Data;

import java.util.List;

@Data
public class SimpleBarablahTeacherUpdateBatchRequest {

    private List<Long> teacherIds;

    private String status;

}
