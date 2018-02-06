package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherController;

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
 * 2018年02月06日 03:55:37
 */
@Api(tags = "教师", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteacher", method = RequestMethod.GET)
public class SimpleBarablahTeacherController extends AbstractBarablahTeacherController {
    @Autowired
    private SimpleBarablahTeacherService service;

    @Override
    public SimpleBarablahTeacherService getService() {
        return service;
    }
}
