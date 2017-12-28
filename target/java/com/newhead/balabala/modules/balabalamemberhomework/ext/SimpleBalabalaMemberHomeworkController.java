package com.newhead.balabala.modules.balabalamemberhomework.ext;

import com.newhead.balabala.modules.balabalamemberhomework.base.AbstractBalabalaMemberHomeworkController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 学生作业表控制
 * 2017年12月28日 06:54:52
 */
@Api(tags = "学生作业表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamemberhomework", method = RequestMethod.GET)
public class SimpleBalabalaMemberHomeworkController extends AbstractBalabalaMemberHomeworkController {
    @Autowired
    private SimpleBalabalaMemberHomeworkService service;

    @Override
    public SimpleBalabalaMemberHomeworkService getService() {
        return service;
    }
}
