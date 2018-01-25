package com.newhead.barablah.modules.barablahmembersignup.ext;

import com.newhead.barablah.modules.barablahmembersignup.base.AbstractBarablahMemberSignupController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员报名表控制
 * 2018年01月25日 03:24:34
 */
@Api(tags = "会员报名表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmembersignup", method = RequestMethod.GET)
public class SimpleBarablahMemberSignupController extends AbstractBarablahMemberSignupController {
    @Autowired
    private SimpleBarablahMemberSignupService service;

    @Override
    public SimpleBarablahMemberSignupService getService() {
        return service;
    }
}
