package com.newhead.barablah.modules.barablahclass.ext;

import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassController;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassOpenRequest;
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
 * 开班控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "开班", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclass", method = RequestMethod.GET)
public class SimpleBarablahClassController extends AbstractBarablahClassController {
    @Autowired
    private SimpleBarablahClassService service;

    @Override
    public SimpleBarablahClassService getService() {
        return service;
    }

    @ApiOperation(value = "开班", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "open", method = RequestMethod.POST)
    public ApiEntity open(@RequestBody SimpleBarablahClassOpenRequest request) {
        getService().open(request);
        return new ApiEntity<>();
    }
}
