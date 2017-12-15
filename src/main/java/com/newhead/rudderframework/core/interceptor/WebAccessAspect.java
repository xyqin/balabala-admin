package com.newhead.rudderframework.core.interceptor;

import com.google.common.collect.Lists;

import com.newhead.rudderframework.core.annotation.WebAccessLog;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.ResourceAccessException;

import java.sql.SQLException;
import java.util.Objects;

/**
 * Created by xyqin on 16/12/12.
 */
@Aspect
public class WebAccessAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebAccessAspect.class);

    @Around("execution(public * com.newhead.*.web.*.*(..))")
    public Object doAccess(ProceedingJoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        RequestMapping request = AnnotationUtils.findAnnotation(signature.getMethod(), RequestMapping.class);
        WebAccessLog access = AnnotationUtils.findAnnotation(signature.getMethod(), WebAccessLog.class);

        if (Objects.nonNull(request) && Objects.nonNull(access) && access.enableRequestLog()) {
            logger.info("api:access:request, 地址=[{} {}], 参数={}",
                    request.method() == null || request.method().length == 0 ? "GET" : request.method()[0],
                    request.value() == null || request.value().length == 0 ? "" : request.value()[0],
                    Lists.newArrayList(point.getArgs()));
        }

        Object retVal;

        try {
            retVal = point.proceed();
        } catch (ApiException ex) {
            logger.warn(ex.getMessage());
            return new ApiEntity(ex.getStatusCode(), ex.getStatusMessage(), ex.getService(), ex.getPath());
        } catch (SQLException | DataAccessException ex) {
            logger.error(ex.getMessage(), ex);
            return new ApiEntity<>(ApiStatus.STATUS_500.getCode(), "数据访问异常, 请联系技术人员");
        } catch (ResourceAccessException ex) {
            logger.error(ex.getMessage(), ex);
            return new ApiEntity<>(ApiStatus.STATUS_500.getCode(), "资源暂时不可访问, 请稍后再试");
        } catch (Throwable ex) {
            logger.error(ex.getMessage(), ex);
            return new ApiEntity<>(ApiStatus.STATUS_500.getCode(), ex.getMessage());
        }

        if (Objects.nonNull(request) && Objects.nonNull(access) && access.enableResponseLog()) {
//            logger.debug("api:access:response, 地址=[{} {}], 响应={}",
//                    request.method() == null || request.method().length == 0 ? "GET" :request.method()[0],
//                    request.value() == null || request.value().length == 0 ? "" : request.value()[0],
//                    Utils.nullObjectToEmpty(retVal));
        }

        return retVal;
    }

}
