package com.newhead.barablah.modules.barablahclasslesson.ext.protocol;

import lombok.Data;

import java.util.List;

@Data
public class SimpleBarablahClassLessonUpdateBatchRequest {

    private List<Long> lessonIds;

    private String startAt;

    private String endAt;

}
