package com.newhead.rudderframework.core.http;

/**
 * 
 * @author wliu
 *
 */
public class HttpContext implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String cookie;

	private String baseUrl;

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
}
