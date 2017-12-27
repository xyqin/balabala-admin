package com.newhead.balabala.modules.balabalaregion.ext;

import com.newhead.balabala.modules.balabalaregion.base.AbstractBalabalaRegionController;

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
 * 2017年12月28日 12:00:28
 */
@Api(tags = "地区", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalaregion", method = RequestMethod.GET)
public class SimpleBalabalaRegionController extends AbstractBalabalaRegionController {
    @Autowired
    private SimpleBalabalaRegionService service;

    @Override
    public SimpleBalabalaRegionService getService() {
        return service;
    }
}
