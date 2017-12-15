package com.newhead.rudderframework.core.config;

import org.quartz.spi.JobFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Created by ling on 2017/6/8.
 */
public class JobConfig {
    @Bean
    public JobFactory jobFactory(ApplicationContext applicationContext) {
//        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
//        jobFactory.setApplicationContext(applicationContext);
//        return jobFactory;
        return null;
    }
}
