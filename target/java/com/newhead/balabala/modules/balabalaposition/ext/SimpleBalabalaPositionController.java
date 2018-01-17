package com.newhead.balabala.modules.balabalaposition.ext;

import com.newhead.balabala.modules.balabalaposition.base.AbstractBalabalaPositionController;

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
 * 2018年01月17日 05:42:34
 */
@Api(tags = "广告位置表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalaposition", method = RequestMethod.GET)
public class SimpleBalabalaPositionController extends AbstractBalabalaPositionController {
    @Autowired
    private SimpleBalabalaPositionService service;

    @Override
    public SimpleBalabalaPositionService getService() {
        return service;
    }
}
