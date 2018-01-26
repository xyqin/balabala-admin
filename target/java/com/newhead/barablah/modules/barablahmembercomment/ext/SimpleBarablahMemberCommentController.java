package com.newhead.barablah.modules.barablahmembercomment.ext;

import com.newhead.barablah.modules.barablahmembercomment.base.AbstractBarablahMemberCommentController;

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
 * 2018年01月26日 03:39:47
 */
@Api(tags = "教师评语表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmembercomment", method = RequestMethod.GET)
public class SimpleBarablahMemberCommentController extends AbstractBarablahMemberCommentController {
    @Autowired
    private SimpleBarablahMemberCommentService service;

    @Override
    public SimpleBarablahMemberCommentService getService() {
        return service;
    }
}
