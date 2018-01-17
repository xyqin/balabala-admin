package com.newhead.balabala.modules.balabalacampus.ext;

import com.newhead.balabala.modules.balabalacampus.base.AbstractBalabalaCampusController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 校区控制
 * 2018年01月17日 05:42:34
 */
@Api(tags = "校区", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalacampus", method = RequestMethod.GET)
public class SimpleBalabalaCampusController extends AbstractBalabalaCampusController {
    @Autowired
    private SimpleBalabalaCampusService service;

    @Override
    public SimpleBalabalaCampusService getService() {
        return service;
    }
}
