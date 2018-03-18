package com.newhead.rudderframework.modules.ruddermenu2permission.ext;

import com.newhead.rudderframework.modules.ruddermenu2permission.base.AbstractRudderMenu2permissionController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 菜单权限关系控制
 * 2018年03月18日 05:08:24
 */
@Api(tags = "菜单权限关系", description = "相关的API")
@RestController
@RequestMapping(value = "/ruddermenu2permission", method = RequestMethod.GET)
public class SimpleRudderMenu2permissionController extends AbstractRudderMenu2permissionController {
    @Autowired
    private SimpleRudderMenu2permissionService service;

    @Override
    public SimpleRudderMenu2permissionService getService() {
        return service;
    }
}
