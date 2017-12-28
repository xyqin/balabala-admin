package com.newhead.balabala.modules.balabalamembercomment.ext;

import com.newhead.balabala.modules.balabalamembercomment.base.AbstractBalabalaMemberCommentController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教师评语表控制
 * 2017年12月28日 06:54:52
 */
@Api(tags = "教师评语表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamembercomment", method = RequestMethod.GET)
public class SimpleBalabalaMemberCommentController extends AbstractBalabalaMemberCommentController {
    @Autowired
    private SimpleBalabalaMemberCommentService service;

    @Override
    public SimpleBalabalaMemberCommentService getService() {
        return service;
    }
}
