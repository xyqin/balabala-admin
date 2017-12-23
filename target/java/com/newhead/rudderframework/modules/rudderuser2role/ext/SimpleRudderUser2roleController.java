package com.newhead.rudderframework.modules.rudderuser2role.ext;

import com.newhead.rudderframework.modules.rudderuser2role.base.AbstractRudderUser2roleController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 用户角色关系控制
 * 2017年12月23日 02:12:57
 */
@Api(tags = "用户角色关系", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderuser2role", method = RequestMethod.GET)
public class SimpleRudderUser2roleController extends AbstractRudderUser2roleController {
    @Autowired
    private SimpleRudderUser2roleService service;

    @Override
    public SimpleRudderUser2roleService getService() {
        return service;
    }
}
