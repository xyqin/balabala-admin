package com.newhead.barablah.modules.barablahtextbook.ext;

import com.newhead.barablah.modules.barablahtextbook.base.AbstractBarablahTextbookController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教材表控制
 * 2018年01月26日 11:13:52
 */
@Api(tags = "教材表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahtextbook", method = RequestMethod.GET)
public class SimpleBarablahTextbookController extends AbstractBarablahTextbookController {
    @Autowired
    private SimpleBarablahTextbookService service;

    @Override
    public SimpleBarablahTextbookService getService() {
        return service;
    }
}
