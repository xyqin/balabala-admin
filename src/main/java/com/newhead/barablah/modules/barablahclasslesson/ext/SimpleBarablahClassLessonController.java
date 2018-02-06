package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonController;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonPostponeBatchRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonUpdateBatchRequest;
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
 * 开班课时控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "开班课时", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclasslesson", method = RequestMethod.GET)
public class SimpleBarablahClassLessonController extends AbstractBarablahClassLessonController {
    @Autowired
    private SimpleBarablahClassLessonService service;

    @Override
    public SimpleBarablahClassLessonService getService() {
        return service;
    }

    @ApiOperation(value = "批量更新课时时间", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatebatch", method = RequestMethod.POST)
    public ApiEntity updatebatch(@RequestBody SimpleBarablahClassLessonUpdateBatchRequest request) {
        getService().updatebatch(request);
        return new ApiEntity<>();
    }

    @ApiOperation(value = "批量延迟课时", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "postponebatch", method = RequestMethod.POST)
    public ApiEntity postponebatch(@RequestBody SimpleBarablahClassLessonPostponeBatchRequest request) {
        getService().postponebatch(request);
        return new ApiEntity<>();
    }
}
