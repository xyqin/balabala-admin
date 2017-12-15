package com.newhead.rudderframework.core.interceptor;

import com.newhead.rudderframework.core.config.ApiContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Leo
 */
public class WebContextInterceptor extends HandlerInterceptorAdapter {

    @Override
    public final boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws ServletException, IOException {
        ApiContext apiContext = new ApiContext(request);
        request.getSession().setAttribute(ApiContext.API_CONTEXT, apiContext);
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }


}
