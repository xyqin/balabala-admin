package com.newhead.rudderframework.core.config;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * 接口请求的上下文对象。封装了HttpRequest对象，并抽取了Appid、Mid、客户端IP等属性。
 *
 * @author Leo
 */
public class ApiContext implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(ApiContext.class);

    public static final String API_CONTEXT = "API_CONTEXT";

    private String appid;
    private String appVer;
    private String mid;
    private String accessToken;
    private String clientIp;

    public ApiContext(HttpServletRequest request) {
        this.appid = StringUtils.defaultString(request.getHeader("Appid"), "");
        this.appVer = StringUtils.defaultString(request.getHeader("AppVer"), "");
        this.mid = StringUtils.defaultString(request.getHeader("Mid"), "");
        this.accessToken = StringUtils.defaultString(request.getHeader("AccessToken"), "");
        this.clientIp = this.getClientIp(request);
    }

    public String getAppid() {
        return appid;
    }

    public String getAppVer() {
        return appVer;
    }

    public String getMid() {
        return mid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getClientIp() {
        return clientIp;
    }

    private String getClientIp(HttpServletRequest request) {
        if (logger.isTraceEnabled()) {
            logger.trace("x-forwarded-for=[" + request.getHeader("x-forwarded-for") + "],x-real_ip=["
                    + request.getHeader("x-real_ip") + "],RemoteAddr=[" + request.getRemoteAddr() + "]");
        }
        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isBlank(ip)) {
            ip = request.getHeader("x-real_ip");
        } else {
            ip = StringUtils.substringBefore(ip, ","); // x-forwarded-for有可能包含多个IP，应取最前面那个
        }
        if (StringUtils.isBlank(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

}
