package com.newhead.rudderframework.core.web.api;

/**
 * Created by ling on 2017/4/5.
 */
public class ApiValidateException extends ApiException{
    public ApiValidateException(ApiStatus status) {
        super(status);
    }

    public ApiValidateException(int code, String message) {
        super(code, message);
    }

    public ApiValidateException(ApiStatus status, String service, String path) {
        super(status, service, path);
    }

    public ApiValidateException(int code, String message, String service, String path) {
        super(code, message, service, path);
    }
}
