package com.newhead.balabala.modules.balabalamembershippingaddress.ext;

import com.newhead.balabala.modules.balabalamembershippingaddress.base.AbstractBalabalaMemberShippingAddressController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 收货地址控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "收货地址", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamembershippingaddress", method = RequestMethod.GET)
public class SimpleBalabalaMemberShippingAddressController extends AbstractBalabalaMemberShippingAddressController {
    @Autowired
    private SimpleBalabalaMemberShippingAddressService service;

    @Override
    public SimpleBalabalaMemberShippingAddressService getService() {
        return service;
    }
}
