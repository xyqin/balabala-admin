package com.newhead.barablah.modules.barablahmemberhomework.ext;

import com.newhead.barablah.modules.barablahmemberhomework.base.AbstractBarablahMemberHomeworkController;

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
 * 2018年01月18日 06:52:58
 */
@Api(tags = "学生作业表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberhomework", method = RequestMethod.GET)
public class SimpleBarablahMemberHomeworkController extends AbstractBarablahMemberHomeworkController {
    @Autowired
    private SimpleBarablahMemberHomeworkService service;

    @Override
    public SimpleBarablahMemberHomeworkService getService() {
        return service;
    }
}
