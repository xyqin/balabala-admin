package com.newhead.rudderframework.modules.ruddermenu.ext;

import com.newhead.rudderframework.modules.ruddermenu.base.AbstractRudderMenuController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 菜单控制
 * 2018年02月06日 02:50:56
 */
@Api(tags = "菜单", description = "相关的API")
@RestController
@RequestMapping(value = "/ruddermenu", method = RequestMethod.GET)
public class SimpleRudderMenuController extends AbstractRudderMenuController {
    @Autowired
    private SimpleRudderMenuService service;

    @Override
    public SimpleRudderMenuService getService() {
        return service;
    }
}
