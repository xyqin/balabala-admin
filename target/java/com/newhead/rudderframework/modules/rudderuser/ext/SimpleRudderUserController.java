package com.newhead.rudderframework.modules.rudderuser.ext;

import com.newhead.rudderframework.modules.rudderuser.base.AbstractRudderUserController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 用户控制
 * 2018年03月18日 02:48:17
 */
@Api(tags = "用户", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderuser", method = RequestMethod.GET)
public class SimpleRudderUserController extends AbstractRudderUserController {
    @Autowired
    private SimpleRudderUserService service;

    @Override
    public SimpleRudderUserService getService() {
        return service;
    }
}
