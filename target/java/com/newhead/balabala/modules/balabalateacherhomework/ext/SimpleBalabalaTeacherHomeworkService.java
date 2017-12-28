package com.newhead.balabala.modules.balabalateacherhomework.ext;

import com.newhead.balabala.modules.balabalateacherhomework.base.AbstractBalabalaTeacherHomeworkService;
import com.newhead.balabala.modules.balabalateacherhomework.base.repository.dao.BalabalaTeacherHomeworkMapper;
import com.newhead.balabala.modules.balabalateacherhomework.base.repository.entity.BalabalaTeacherHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师发布作业表服务
 * 2017年12月28日 06:54:52
 */
@Api(tags = "教师发布作业表", description = "相关的API")
@Service
public class SimpleBalabalaTeacherHomeworkService extends AbstractBalabalaTeacherHomeworkService {

    @Autowired
    private BalabalaTeacherHomeworkMapper mapper;

    @Override
    protected BalabalaTeacherHomeworkMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTeacherHomework entity) {

    }
}
