package com.newhead.balabala.modules.balabalatextbookhomework.ext;

import com.newhead.balabala.modules.balabalatextbookhomework.base.AbstractBalabalaTextbookHomeworkController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教材作业表控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "教材作业表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalatextbookhomework", method = RequestMethod.GET)
public class SimpleBalabalaTextbookHomeworkController extends AbstractBalabalaTextbookHomeworkController {
    @Autowired
    private SimpleBalabalaTextbookHomeworkService service;

    @Override
    public SimpleBalabalaTextbookHomeworkService getService() {
        return service;
    }
}
