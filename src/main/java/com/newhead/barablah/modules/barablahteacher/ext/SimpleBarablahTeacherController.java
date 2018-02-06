package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherController;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherUpdateBatchRequest;
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
 * 教师控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "教师", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteacher", method = RequestMethod.GET)
public class SimpleBarablahTeacherController extends AbstractBarablahTeacherController {
    @Autowired
    private SimpleBarablahTeacherService service;

    @Override
    public SimpleBarablahTeacherService getService() {
        return service;
    }

    @ApiOperation(value = "批量更新教师状态", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatebatch", method = RequestMethod.POST)
    public ApiEntity updatebatch(@RequestBody SimpleBarablahTeacherUpdateBatchRequest request) {
        getService().updatebatch(request);
        return new ApiEntity<>();
    }
}
