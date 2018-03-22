package com.newhead.barablah.modules.barablahteacherhomeworkitem.ext;

import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.AbstractBarablahTeacherHomeworkItemController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教师发布作业题目表控制
 * 2018年03月22日 08:05:41
 */
@Api(tags = "教师发布作业题目表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteacherhomeworkitem", method = RequestMethod.GET)
public class SimpleBarablahTeacherHomeworkItemController extends AbstractBarablahTeacherHomeworkItemController {
    @Autowired
    private SimpleBarablahTeacherHomeworkItemService service;

    @Override
    public SimpleBarablahTeacherHomeworkItemService getService() {
        return service;
    }
}
