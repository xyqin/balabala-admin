package com.newhead.barablah.modules.barablahmemberlessonlog.ext;

import com.newhead.barablah.modules.barablahmemberlessonlog.base.AbstractBarablahMemberLessonlogService;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.dao.BarablahMemberLessonlogMapper;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 学员课时活动记录服务
 * 2018年03月24日 01:24:52
 */
@Api(tags = "学员课时活动记录", description = "相关的API")
@Service
public class SimpleBarablahMemberLessonlogService extends AbstractBarablahMemberLessonlogService {

    @Autowired
    private BarablahMemberLessonlogMapper mapper;

    @Override
    protected BarablahMemberLessonlogMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberLessonlog entity) {

    }
}
