package com.newhead.rudderframework.core.web.component.pagination;

/**
 * Created by xyqin on 16/5/23.
 */
public class Sort {

    private String property;

    private Direction direction;

    public Sort(String property, Direction direction) {
        this.direction = direction;
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public Direction getDirection() {
        return direction;
    }
}
