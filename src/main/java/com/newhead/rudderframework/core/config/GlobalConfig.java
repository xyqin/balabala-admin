package com.newhead.rudderframework.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 */
@Configuration
public class GlobalConfig extends WebMvcConfigurerAdapter {

    @Value("${storeconfig.storepath}")
    public String storepath;

    @Value("${storeconfig.storelink}")
    public String storelink;

}

