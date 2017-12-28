package com.newhead.balabala.modules.balabalateacher.ext;

import com.newhead.balabala.modules.balabalateacher.base.AbstractBalabalaTeacherController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教师控制
 * 2017年12月28日 05:00:56
 */
@Api(tags = "教师", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalateacher", method = RequestMethod.GET)
public class SimpleBalabalaTeacherController extends AbstractBalabalaTeacherController {
    @Autowired
    private SimpleBalabalaTeacherService service;

    @Override
    public SimpleBalabalaTeacherService getService() {
        return service;
    }
}
