package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonController;

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
 * 2018年01月25日 02:58:38
 */
@Api(tags = "开班课时", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclasslesson", method = RequestMethod.GET)
public class SimpleBarablahClassLessonController extends AbstractBarablahClassLessonController {
    @Autowired
    private SimpleBarablahClassLessonService service;

    @Override
    public SimpleBarablahClassLessonService getService() {
        return service;
    }
}
