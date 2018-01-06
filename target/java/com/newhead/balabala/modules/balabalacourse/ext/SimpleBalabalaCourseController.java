package com.newhead.balabala.modules.balabalacourse.ext;

import com.newhead.balabala.modules.balabalacourse.base.AbstractBalabalaCourseController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 课程控制
 * 2018年01月06日 09:19:38
 */
@Api(tags = "课程", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalacourse", method = RequestMethod.GET)
public class SimpleBalabalaCourseController extends AbstractBalabalaCourseController {
    @Autowired
    private SimpleBalabalaCourseService service;

    @Override
    public SimpleBalabalaCourseService getService() {
        return service;
    }
}
