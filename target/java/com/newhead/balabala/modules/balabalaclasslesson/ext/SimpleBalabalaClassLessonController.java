package com.newhead.balabala.modules.balabalaclasslesson.ext;

import com.newhead.balabala.modules.balabalaclasslesson.base.AbstractBalabalaClassLessonController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 开班课时控制
 * 2018年01月09日 04:35:22
 */
@Api(tags = "开班课时", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalaclasslesson", method = RequestMethod.GET)
public class SimpleBalabalaClassLessonController extends AbstractBalabalaClassLessonController {
    @Autowired
    private SimpleBalabalaClassLessonService service;

    @Override
    public SimpleBalabalaClassLessonService getService() {
        return service;
    }
}
