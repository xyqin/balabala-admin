package com.newhead.balabala.modules.balabalatextbook.ext;

import com.newhead.balabala.modules.balabalatextbook.base.AbstractBalabalaTextbookController;

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
 * 2017年12月28日 07:22:02
 */
@Api(tags = "教材表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalatextbook", method = RequestMethod.GET)
public class SimpleBalabalaTextbookController extends AbstractBalabalaTextbookController {
    @Autowired
    private SimpleBalabalaTextbookService service;

    @Override
    public SimpleBalabalaTextbookService getService() {
        return service;
    }
}
