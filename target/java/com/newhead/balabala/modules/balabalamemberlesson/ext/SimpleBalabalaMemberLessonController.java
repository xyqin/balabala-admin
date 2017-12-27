package com.newhead.balabala.modules.balabalamemberlesson.ext;

import com.newhead.balabala.modules.balabalamemberlesson.base.AbstractBalabalaMemberLessonController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员课时表控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "会员课时表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamemberlesson", method = RequestMethod.GET)
public class SimpleBalabalaMemberLessonController extends AbstractBalabalaMemberLessonController {
    @Autowired
    private SimpleBalabalaMemberLessonService service;

    @Override
    public SimpleBalabalaMemberLessonService getService() {
        return service;
    }
}
