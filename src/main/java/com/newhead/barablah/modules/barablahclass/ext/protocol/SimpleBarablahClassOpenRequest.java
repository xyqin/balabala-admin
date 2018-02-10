package com.newhead.barablah.modules.barablahclass.ext.protocol;

import lombok.Data;

@Data
public class SimpleBarablahClassOpenRequest {

    /**
     * 开班ID
     */
    private Long id;

    /**
     * 总课时次数
     */
    private int onlineLessons;

    /**
     * 每次几节
     */
    private int onlineLessonsPerTime;

    private int onlineDuration;

    /**
     * 总课时次数
     */
    private int offlineLessons;

    /**
     * 每次几节
     */
    private int offlineLessonsPerTime;

    private int offlineDuration;

    private String startAtOnline;

    private String startAtOffline;

}
