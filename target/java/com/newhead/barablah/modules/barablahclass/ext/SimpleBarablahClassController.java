package com.newhead.barablah.modules.barablahclass.ext;

import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassController;

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
 * 2018年03月18日 05:08:23
 */
@Api(tags = "开班", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclass", method = RequestMethod.GET)
public class SimpleBarablahClassController extends AbstractBarablahClassController {
    @Autowired
    private SimpleBarablahClassService service;

    @Override
    public SimpleBarablahClassService getService() {
        return service;
    }
}
