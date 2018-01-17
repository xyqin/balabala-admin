package com.newhead.balabala.modules.balabalapositioncontent.ext;

import com.newhead.balabala.modules.balabalapositioncontent.base.AbstractBalabalaPositionContentController;

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
 * 2018年01月17日 05:42:34
 */
@Api(tags = "位置内容表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalapositioncontent", method = RequestMethod.GET)
public class SimpleBalabalaPositionContentController extends AbstractBalabalaPositionContentController {
    @Autowired
    private SimpleBalabalaPositionContentService service;

    @Override
    public SimpleBalabalaPositionContentService getService() {
        return service;
    }
}
