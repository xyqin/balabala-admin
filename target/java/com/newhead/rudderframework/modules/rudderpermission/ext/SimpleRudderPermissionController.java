package com.newhead.rudderframework.modules.rudderpermission.ext;

import com.newhead.rudderframework.modules.rudderpermission.base.AbstractRudderPermissionController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 权限控制
 * 2018年03月18日 05:08:24
 */
@Api(tags = "权限", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderpermission", method = RequestMethod.GET)
public class SimpleRudderPermissionController extends AbstractRudderPermissionController {
    @Autowired
    private SimpleRudderPermissionService service;

    @Override
    public SimpleRudderPermissionService getService() {
        return service;
    }
}
