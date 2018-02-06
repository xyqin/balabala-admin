package com.newhead.barablah.modules.barablahclasslesson.ext.protocol;

import lombok.Data;

import java.util.List;

@Data
public class SimpleBarablahClassLessonPostponeBatchRequest {

    private List<Long> lessonIds;

}
