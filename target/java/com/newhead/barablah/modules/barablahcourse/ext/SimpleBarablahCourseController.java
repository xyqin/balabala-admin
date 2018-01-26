package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseController;

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
 * 2018年01月26日 11:13:52
 */
@Api(tags = "课程", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcourse", method = RequestMethod.GET)
public class SimpleBarablahCourseController extends AbstractBarablahCourseController {
    @Autowired
    private SimpleBarablahCourseService service;

    @Override
    public SimpleBarablahCourseService getService() {
        return service;
    }
}
