package com.newhead.barablah.modules.barablahpositioncontent.ext;

import com.newhead.barablah.modules.barablahpositioncontent.base.AbstractBarablahPositionContentController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 位置内容表控制
 * 2018年03月22日 08:05:41
 */
@Api(tags = "位置内容表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahpositioncontent", method = RequestMethod.GET)
public class SimpleBarablahPositionContentController extends AbstractBarablahPositionContentController {
    @Autowired
    private SimpleBarablahPositionContentService service;

    @Override
    public SimpleBarablahPositionContentService getService() {
        return service;
    }
}
