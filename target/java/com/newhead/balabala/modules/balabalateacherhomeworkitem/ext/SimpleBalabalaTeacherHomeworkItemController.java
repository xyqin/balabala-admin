package com.newhead.balabala.modules.balabalateacherhomeworkitem.ext;

import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.AbstractBalabalaTeacherHomeworkItemController;

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
 * 2018年01月17日 05:42:34
 */
@Api(tags = "教师发布作业题目表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalateacherhomeworkitem", method = RequestMethod.GET)
public class SimpleBalabalaTeacherHomeworkItemController extends AbstractBalabalaTeacherHomeworkItemController {
    @Autowired
    private SimpleBalabalaTeacherHomeworkItemService service;

    @Override
    public SimpleBalabalaTeacherHomeworkItemService getService() {
        return service;
    }
}
