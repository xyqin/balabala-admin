package com.newhead.rudderframework.core.interceptor;

import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

/**
 * Controller层全局异常拦截
 * Created by xyqin on 16/5/26.
 */
@ControllerAdvice(basePackages = "com.newhead")
public class ControllerExceptionInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionInterceptor.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    ResponseEntity<ApiEntity> handleApiException(Throwable ex) {
        logger.error(ex.getMessage(), ex);

        ApiEntity body = null;
        if (ex instanceof BindException
                || ex instanceof HttpMessageNotReadableException
                || ex instanceof MethodArgumentNotValidException
                || ex instanceof MissingServletRequestPartException
                || ex instanceof TypeMismatchException) {

            body = new ApiEntity(ApiStatus.STATUS_400);
        } else if (ex instanceof MissingServletRequestParameterException) {
            String pn = ((MissingServletRequestParameterException) ex).getParameterName();
            body = new ApiEntity(ApiStatus.STATUS_400.getCode(),"参数"+pn+"丢失！");

        } else if (ex instanceof HttpRequestMethodNotSupportedException) {
            body = new ApiEntity(ApiStatus.STATUS_405);
        } else if (ex instanceof HttpMediaTypeNotAcceptableException) {
            body = new ApiEntity(ApiStatus.STATUS_406);
        } else if (ex instanceof ConversionNotSupportedException
                || ex instanceof HttpMessageNotWritableException
                || ex instanceof MissingPathVariableException) {
            body = new ApiEntity(ApiStatus.STATUS_500);
        } else if (ex instanceof ApiValidateException) {
            body = new ApiEntity(ApiStatus.STATUS_400.getCode(),ex.getMessage());
        } else {
            body = new ApiEntity(ApiStatus.STATUS_400);
        }
        return new ResponseEntity<>(body, HttpStatus.OK);
    }

}
