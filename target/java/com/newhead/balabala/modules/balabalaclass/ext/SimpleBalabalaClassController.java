package com.newhead.balabala.modules.balabalaclass.ext;

import com.newhead.balabala.modules.balabalaclass.base.AbstractBalabalaClassController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 开班控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "开班", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalaclass", method = RequestMethod.GET)
public class SimpleBalabalaClassController extends AbstractBalabalaClassController {
    @Autowired
    private SimpleBalabalaClassService service;

    @Override
    public SimpleBalabalaClassService getService() {
        return service;
    }
}
