package com.newhead.rudderframework.core.domain;

import java.util.Date;

/**
 * 可审计的实体对象
 * Created by xyqin on 16/6/2.
 */
public interface AuditableEntity<I> {

    Date getCreatedAt();

    Date getUpdatedAt();

    Long getCreator();

    Long getLastModifier();

}
