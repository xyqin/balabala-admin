package com.newhead.barablah.modules.barablahmemberlesson.ext;

import com.newhead.barablah.modules.barablahmemberlesson.base.AbstractBarablahMemberLessonController;

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
 * 2018年02月07日 04:55:37
 */
@Api(tags = "会员课时表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberlesson", method = RequestMethod.GET)
public class SimpleBarablahMemberLessonController extends AbstractBarablahMemberLessonController {
    @Autowired
    private SimpleBarablahMemberLessonService service;

    @Override
    public SimpleBarablahMemberLessonService getService() {
        return service;
    }
}
