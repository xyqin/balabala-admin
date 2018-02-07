package com.newhead.barablah.modules.barablahteacherhomework.ext;

import com.newhead.barablah.modules.barablahteacherhomework.base.AbstractBarablahTeacherHomeworkController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教师发布作业表控制
 * 2018年02月07日 04:55:37
 */
@Api(tags = "教师发布作业表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteacherhomework", method = RequestMethod.GET)
public class SimpleBarablahTeacherHomeworkController extends AbstractBarablahTeacherHomeworkController {
    @Autowired
    private SimpleBarablahTeacherHomeworkService service;

    @Override
    public SimpleBarablahTeacherHomeworkService getService() {
        return service;
    }
}
