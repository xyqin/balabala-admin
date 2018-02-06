package com.newhead.barablah.modules.barablahcampus.ext;

import com.newhead.barablah.modules.barablahcampus.base.AbstractBarablahCampusController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 校区控制
 * 2018年02月06日 05:34:55
 */
@Api(tags = "校区", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcampus", method = RequestMethod.GET)
public class SimpleBarablahCampusController extends AbstractBarablahCampusController {
    @Autowired
    private SimpleBarablahCampusService service;

    @Override
    public SimpleBarablahCampusService getService() {
        return service;
    }
}
