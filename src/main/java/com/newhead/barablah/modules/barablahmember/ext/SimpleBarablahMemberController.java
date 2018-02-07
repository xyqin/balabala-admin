package com.newhead.barablah.modules.barablahmember.ext;

import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberController;
import com.newhead.barablah.modules.barablahmember.ext.protocol.SimpleBarablahMemberUpdateBatchRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 会员控制
 * 2018年02月07日 04:55:37
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

    @ApiOperation(value = "批量更新会员状态", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatebatch", method = RequestMethod.POST)
    public ApiEntity updatebatch(@RequestBody SimpleBarablahMemberUpdateBatchRequest request) {
        getService().updatebatch(request);
        return new ApiEntity<>();
    }
}
