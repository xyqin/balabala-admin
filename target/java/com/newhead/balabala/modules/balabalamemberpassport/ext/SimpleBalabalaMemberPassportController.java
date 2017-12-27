package com.newhead.balabala.modules.balabalamemberpassport.ext;

import com.newhead.balabala.modules.balabalamemberpassport.base.AbstractBalabalaMemberPassportController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员通行证控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "会员通行证", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamemberpassport", method = RequestMethod.GET)
public class SimpleBalabalaMemberPassportController extends AbstractBalabalaMemberPassportController {
    @Autowired
    private SimpleBalabalaMemberPassportService service;

    @Override
    public SimpleBalabalaMemberPassportService getService() {
        return service;
    }
}
