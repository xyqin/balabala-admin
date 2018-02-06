package com.newhead.barablah.modules.barablahposition.ext;

import com.newhead.barablah.modules.barablahposition.base.AbstractBarablahPositionController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 广告位置表控制
 * 2018年02月06日 03:55:37
 */
@Api(tags = "广告位置表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahposition", method = RequestMethod.GET)
public class SimpleBarablahPositionController extends AbstractBarablahPositionController {
    @Autowired
    private SimpleBarablahPositionService service;

    @Override
    public SimpleBarablahPositionService getService() {
        return service;
    }
}
