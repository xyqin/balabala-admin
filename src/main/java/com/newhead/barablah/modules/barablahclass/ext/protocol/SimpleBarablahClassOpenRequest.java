package com.newhead.barablah.modules.barablahclass.ext.protocol;

import lombok.Data;

@Data
public class SimpleBarablahClassOpenRequest {

    /**
     * 开班ID
     */
    private Long id;

    private int onlineLessons;

    private int onlineDuration;

    private int offlineLessons;

    private int offlineDuration;

    private String startAtOnline;

    private String startAtOffline;

}
