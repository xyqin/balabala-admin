package com.newhead.sc.modules.scdevicesignup.ext;

import com.newhead.sc.modules.scdevicesignup.base.AbstractScDeviceSignupController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 设备登记控制
 * 2017年12月13日 12:17:48
 */
@Api(tags = "设备登记", description = "相关的API")
@RestController
@RequestMapping(value = "/scdevicesignup", method = RequestMethod.GET)
public class SimpleScDeviceSignupController extends AbstractScDeviceSignupController {
    @Autowired
    private SimpleScDeviceSignupService service;

    @Override
    public SimpleScDeviceSignupService getService() {
        return service;
    }
}
