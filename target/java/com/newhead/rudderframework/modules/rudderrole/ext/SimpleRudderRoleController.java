package com.newhead.rudderframework.modules.rudderrole.ext;

import com.newhead.rudderframework.modules.rudderrole.base.AbstractRudderRoleController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 角色控制
 * 2018年02月06日 03:58:38
 */
@Api(tags = "角色", description = "相关的API")
@RestController
@RequestMapping(value = "/rudderrole", method = RequestMethod.GET)
public class SimpleRudderRoleController extends AbstractRudderRoleController {
    @Autowired
    private SimpleRudderRoleService service;

    @Override
    public SimpleRudderRoleService getService() {
        return service;
    }
}
