package com.newhead.barablah.modules.barablahteachermajor.ext;

import com.newhead.barablah.modules.barablahteachermajor.base.AbstractBarablahTeacherMajorController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教师专业控制
 * 2018年03月22日 08:05:41
 */
@Api(tags = "教师专业", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteachermajor", method = RequestMethod.GET)
public class SimpleBarablahTeacherMajorController extends AbstractBarablahTeacherMajorController {
    @Autowired
    private SimpleBarablahTeacherMajorService service;

    @Override
    public SimpleBarablahTeacherMajorService getService() {
        return service;
    }
}
