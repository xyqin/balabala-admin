package com.newhead.barablah.modules.barablahmember.ext;

import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员控制
 * 2018年01月25日 03:24:34
 */
@Api(tags = "会员", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmember", method = RequestMethod.GET)
public class SimpleBarablahMemberController extends AbstractBarablahMemberController {
    @Autowired
    private SimpleBarablahMemberService service;

    @Override
    public SimpleBarablahMemberService getService() {
        return service;
    }
}
