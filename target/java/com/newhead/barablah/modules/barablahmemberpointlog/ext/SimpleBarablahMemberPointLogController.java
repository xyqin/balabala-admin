package com.newhead.barablah.modules.barablahmemberpointlog.ext;

import com.newhead.barablah.modules.barablahmemberpointlog.base.AbstractBarablahMemberPointLogController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员积分日志表控制
 * 2018年03月24日 04:28:57
 */
@Api(tags = "会员积分日志表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberpointlog", method = RequestMethod.GET)
public class SimpleBarablahMemberPointLogController extends AbstractBarablahMemberPointLogController {
    @Autowired
    private SimpleBarablahMemberPointLogService service;

    @Override
    public SimpleBarablahMemberPointLogService getService() {
        return service;
    }
}
