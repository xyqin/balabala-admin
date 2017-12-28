package com.newhead.balabala.modules.balabalamember.ext;

import com.newhead.balabala.modules.balabalamember.base.AbstractBalabalaMemberController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员控制
 * 2017年12月28日 07:22:02
 */
@Api(tags = "会员", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamember", method = RequestMethod.GET)
public class SimpleBalabalaMemberController extends AbstractBalabalaMemberController {
    @Autowired
    private SimpleBalabalaMemberService service;

    @Override
    public SimpleBalabalaMemberService getService() {
        return service;
    }
}
