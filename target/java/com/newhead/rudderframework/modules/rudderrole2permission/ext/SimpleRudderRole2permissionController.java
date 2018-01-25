package com.newhead.rudderframework.modules.rudderrole2permission.ext;

import com.newhead.rudderframework.modules.rudderrole2permission.base.AbstractRudderRole2permissionController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 角色权限关系控制
 * 2018年01月25日 03:24:34
 */
@Api(tags = "角色权限关系", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderrole2permission", method = RequestMethod.GET)
public class SimpleRudderRole2permissionController extends AbstractRudderRole2permissionController {
    @Autowired
    private SimpleRudderRole2permissionService service;

    @Override
    public SimpleRudderRole2permissionService getService() {
        return service;
    }
}
