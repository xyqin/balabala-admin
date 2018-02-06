package com.newhead.barablah.modules.barablahmemberpassport.ext;

import com.newhead.barablah.modules.barablahmemberpassport.base.AbstractBarablahMemberPassportController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员通行证控制
 * 2018年02月06日 02:50:56
 */
@Api(tags = "会员通行证", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmemberpassport", method = RequestMethod.GET)
public class SimpleBarablahMemberPassportController extends AbstractBarablahMemberPassportController {
    @Autowired
    private SimpleBarablahMemberPassportService service;

    @Override
    public SimpleBarablahMemberPassportService getService() {
        return service;
    }
}
