package com.newhead.rudderframework.core.config;

import com.newhead.rudderframework.core.interceptor.WebContextInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Leo
 */
@Configuration
public class WebRequestConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WebContextInterceptor()).addPathPatterns("/**");
    }
//    @Bean
//    public WebAccessAspect webAccessAspect() {
//        return new WebAccessAspect();
//    }

}
