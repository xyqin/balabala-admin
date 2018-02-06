package com.newhead.barablah.modules.barablahregion.ext;

import com.newhead.barablah.modules.barablahregion.base.AbstractBarablahRegionController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 地区控制
 * 2018年02月06日 03:58:38
 */
@Api(tags = "地区", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahregion", method = RequestMethod.GET)
public class SimpleBarablahRegionController extends AbstractBarablahRegionController {
    @Autowired
    private SimpleBarablahRegionService service;

    @Override
    public SimpleBarablahRegionService getService() {
        return service;
    }
}
