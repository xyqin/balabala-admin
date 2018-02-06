package com.newhead.barablah.modules.barablahmemberlesson.ext;

import com.newhead.barablah.modules.barablahmemberlesson.base.AbstractBarablahMemberLessonService;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.dao.BarablahMemberLessonMapper;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员课时表服务
 * 2018年02月06日 03:58:38
 */
@Api(tags = "会员课时表", description = "相关的API")
@Service
public class SimpleBarablahMemberLessonService extends AbstractBarablahMemberLessonService {

    @Autowired
    private BarablahMemberLessonMapper mapper;

    @Override
    protected BarablahMemberLessonMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberLesson entity) {

    }
}
