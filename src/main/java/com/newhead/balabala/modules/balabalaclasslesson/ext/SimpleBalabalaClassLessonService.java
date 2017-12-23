package com.newhead.balabala.modules.balabalaclasslesson.ext;

import com.newhead.balabala.modules.balabalaclasslesson.base.AbstractBalabalaClassLessonService;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.dao.BalabalaClassLessonMapper;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 开班课时服务
 * 2017年12月23日 02:12:57
 */
@Api(tags = "开班课时", description = "相关的API")
@Service
public class SimpleBalabalaClassLessonService extends AbstractBalabalaClassLessonService {

    @Autowired
    private BalabalaClassLessonMapper mapper;

    @Override
    protected BalabalaClassLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaClassLesson entity) {

    }
}
