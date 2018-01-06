package com.newhead.balabala.modules.balabalamemberpointlog.ext;

import com.newhead.balabala.modules.balabalamemberpointlog.base.AbstractBalabalaMemberPointLogController;

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
 * 2018年01月06日 09:19:38
 */
@Api(tags = "会员积分日志表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamemberpointlog", method = RequestMethod.GET)
public class SimpleBalabalaMemberPointLogController extends AbstractBalabalaMemberPointLogController {
    @Autowired
    private SimpleBalabalaMemberPointLogService service;

    @Override
    public SimpleBalabalaMemberPointLogService getService() {
        return service;
    }
}
