package com.newhead.barablah.modules.barablahmemberlessonlog.ext;

import com.newhead.barablah.modules.barablahmemberlessonlog.base.AbstractBarablahMemberLessonlogController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 学员课时活动记录控制
 * 2018年03月24日 01:24:52
 */
@Api(tags = "学员课时活动记录", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberlessonlog", method = RequestMethod.GET)
public class SimpleBarablahMemberLessonlogController extends AbstractBarablahMemberLessonlogController {
    @Autowired
    private SimpleBarablahMemberLessonlogService service;

    @Override
    public SimpleBarablahMemberLessonlogService getService() {
        return service;
    }
}
