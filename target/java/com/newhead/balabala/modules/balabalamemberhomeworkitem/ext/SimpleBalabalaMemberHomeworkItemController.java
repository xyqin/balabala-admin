package com.newhead.balabala.modules.balabalamemberhomeworkitem.ext;

import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.AbstractBalabalaMemberHomeworkItemController;

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
 * 2017年12月28日 05:00:56
 */
@Api(tags = "会员作业答案表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalamemberhomeworkitem", method = RequestMethod.GET)
public class SimpleBalabalaMemberHomeworkItemController extends AbstractBalabalaMemberHomeworkItemController {
    @Autowired
    private SimpleBalabalaMemberHomeworkItemService service;

    @Override
    public SimpleBalabalaMemberHomeworkItemService getService() {
        return service;
    }
}
