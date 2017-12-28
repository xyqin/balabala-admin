package com.newhead.balabala.modules.balabalaclassmember.ext;

import com.newhead.balabala.modules.balabalaclassmember.base.AbstractBalabalaClassMemberController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 开班会员控制
 * 2017年12月28日 07:22:02
 */
@Api(tags = "开班会员", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalaclassmember", method = RequestMethod.GET)
public class SimpleBalabalaClassMemberController extends AbstractBalabalaClassMemberController {
    @Autowired
    private SimpleBalabalaClassMemberService service;

    @Override
    public SimpleBalabalaClassMemberService getService() {
        return service;
    }
}
