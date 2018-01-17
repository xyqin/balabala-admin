package com.newhead.balabala.modules.balabalateacherhomework.ext;

import com.newhead.balabala.modules.balabalateacherhomework.base.AbstractBalabalaTeacherHomeworkController;

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
 * 2018年01月17日 05:42:34
 */
@Api(tags = "教师发布作业表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalateacherhomework", method = RequestMethod.GET)
public class SimpleBalabalaTeacherHomeworkController extends AbstractBalabalaTeacherHomeworkController {
    @Autowired
    private SimpleBalabalaTeacherHomeworkService service;

    @Override
    public SimpleBalabalaTeacherHomeworkService getService() {
        return service;
    }
}
