package com.newhead.barablah.modules.barablahcountry.ext;

import com.newhead.barablah.modules.barablahcountry.base.AbstractBarablahCountryController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 国籍设置控制
 * 2018年03月24日 04:28:57
 */
@Api(tags = "国籍设置", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcountry", method = RequestMethod.GET)
public class SimpleBarablahCountryController extends AbstractBarablahCountryController {
    @Autowired
    private SimpleBarablahCountryService service;

    @Override
    public SimpleBarablahCountryService getService() {
        return service;
    }
}
