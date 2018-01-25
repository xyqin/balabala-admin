package com.newhead.barablah.modules.barablahclassmember.ext;

import com.newhead.barablah.modules.barablahclassmember.base.AbstractBarablahClassMemberController;

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
 * 2018年01月25日 01:52:20
 */
@Api(tags = "开班会员", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclassmember", method = RequestMethod.GET)
public class SimpleBarablahClassMemberController extends AbstractBarablahClassMemberController {
    @Autowired
    private SimpleBarablahClassMemberService service;

    @Override
    public SimpleBarablahClassMemberService getService() {
        return service;
    }
}
