package com.newhead.rudderframework.core.web.api;

import com.alibaba.fastjson.JSON;

/**
 * Created by xyqin on 16/12/15.
 */
public abstract class AbstractDTO<T> implements DTO<T> {

    @Override
    public void fromDomain(T domain) {
    }

    @Override
    public T toDomain() {
        return null;
    }

    @Override
    public void validateWhenCreating() throws ApiException {

    }

    @Override
    public void validateWhenUpdating() throws ApiException {

    }

    @Override
    public String toString() {
        return JSON.toJSONString("");
    }

}
