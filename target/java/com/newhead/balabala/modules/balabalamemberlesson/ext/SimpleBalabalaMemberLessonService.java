package com.newhead.balabala.modules.balabalamemberlesson.ext;

import com.newhead.balabala.modules.balabalamemberlesson.base.AbstractBalabalaMemberLessonService;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.dao.BalabalaMemberLessonMapper;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员课时表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "会员课时表", description = "相关的API")
@Service
public class SimpleBalabalaMemberLessonService extends AbstractBalabalaMemberLessonService {

    @Autowired
    private BalabalaMemberLessonMapper mapper;

    @Override
    protected BalabalaMemberLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberLesson entity) {

    }
}
