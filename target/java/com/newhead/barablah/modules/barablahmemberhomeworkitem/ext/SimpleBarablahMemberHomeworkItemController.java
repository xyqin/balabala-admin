package com.newhead.barablah.modules.barablahmemberhomeworkitem.ext;

import com.newhead.barablah.modules.barablahmemberhomeworkitem.base.AbstractBarablahMemberHomeworkItemController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员作业答案表控制
 * 2018年02月07日 10:47:07
 */
@Api(tags = "会员作业答案表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberhomeworkitem", method = RequestMethod.GET)
public class SimpleBarablahMemberHomeworkItemController extends AbstractBarablahMemberHomeworkItemController {
    @Autowired
    private SimpleBarablahMemberHomeworkItemService service;

    @Override
    public SimpleBarablahMemberHomeworkItemService getService() {
        return service;
    }
}
