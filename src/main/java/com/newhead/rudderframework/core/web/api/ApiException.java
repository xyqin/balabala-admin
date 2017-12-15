package com.newhead.rudderframework.core.web.api;

/**
 * Created by xyqin on 16/5/10.
 */
public class ApiException extends RuntimeException {

    public static final String DETAIL_MESSAGE_FORMAT = "%s%s - %d: %s";

    private int statusCode;

    private String statusMessage;

    private String service;

    private String path;

    public ApiException(ApiStatus status) {
        this(status.getCode(), status.getMessage(), null, null);
    }

    public ApiException(int code, String message) {
        this(code, message, null, null);
    }

    public ApiException(ApiStatus status, String service, String path) {
        this(status.getCode(), status.getMessage(), service, path);
    }

    public ApiException(int code, String message, String service, String path) {
        super(String.format(DETAIL_MESSAGE_FORMAT, service, path, code, message));
        this.statusCode = code;
        this.statusMessage = message;
        this.service = service;
        this.path = path;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public String getService() {
        return service;
    }

    public String getPath() {
        return path;
    }

}
