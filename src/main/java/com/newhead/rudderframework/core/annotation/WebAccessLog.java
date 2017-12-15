package com.newhead.rudderframework.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * web访问层标签
 * Created by xyqin on 16/12/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface WebAccessLog {

    /**
     * 开启请求日志
     *
     * @return
     */
    boolean enableRequestLog() default true;

    /**
     * 开启响应日志
     *
     * @return
     */
    boolean enableResponseLog() default true;

}
