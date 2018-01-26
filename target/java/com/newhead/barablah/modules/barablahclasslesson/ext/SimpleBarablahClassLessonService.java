package com.newhead.barablah.modules.barablahclasslesson.ext;

import com.newhead.barablah.modules.barablahclasslesson.base.AbstractBarablahClassLessonService;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.dao.BarablahClassLessonMapper;
import com.newhead.barablah.modules.barablahclasslesson.base.repository.entity.BarablahClassLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 开班课时服务
 * 2018年01月26日 11:59:29
 */
@Api(tags = "开班课时", description = "相关的API")
@Service
public class SimpleBarablahClassLessonService extends AbstractBarablahClassLessonService {

    @Autowired
    private BarablahClassLessonMapper mapper;

    @Override
    protected BarablahClassLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahClassLesson entity) {

    }
}
