package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonController;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonPostponeBatchRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonQueryListRequest;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonQueryResponse;
import com.newhead.barablah.modules.barablahclasslesson.ext.protocol.SimpleBarablahClassLessonUpdateBatchRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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

    /**
     * 得到开班课时列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "开班课时ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahClassLessonQueryResponse>> getList(@RequestParam(required = false) Long classId, @RequestParam(required = false) Long teacherId, @RequestParam(required = false) String lessonName, @RequestParam(required = false) String type) {
        SimpleBarablahClassLessonQueryListRequest request = new SimpleBarablahClassLessonQueryListRequest();
        if (!StringUtils.isEmpty(classId)) {
            request.setClassId(classId);
        }
        if (!StringUtils.isEmpty(teacherId)) {
            request.setTeacherId(teacherId);
        }
        if (!StringUtils.isEmpty(lessonName)) {
            request.setLessonName(lessonName);
        }
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        List<SimpleBarablahClassLessonQueryResponse> sources = getService().queryList(request);
        for(SimpleBarablahClassLessonQueryResponse item:sources) {
            Date curd = new Date();
            if (item.getStartAt().getTime()>curd.getTime()) {
                item.setStatus("未开始");
            }
        }
        return new ApiEntity<List<SimpleBarablahClassLessonQueryResponse>>(sources);
    }
}
