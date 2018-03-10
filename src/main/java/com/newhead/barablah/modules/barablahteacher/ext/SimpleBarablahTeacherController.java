package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherController;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherQueryListRequest;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherQueryResponse;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherUpdateBatchRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    /**
     * 得到教师列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师ID")
    @RequestMapping(value = "getlistbyarea", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTeacherQueryResponse>> getList(@RequestParam(required = false) long area) {
        SimpleBarablahTeacherQueryListRequest request = new SimpleBarablahTeacherQueryListRequest();
        request.setArea(area);
        List<SimpleBarablahTeacherQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTeacherQueryResponse>>(sources);
    }

}
