package com.newhead.balabala.modules.balabalateacher.ext;

import com.newhead.balabala.modules.balabalateacher.base.AbstractBalabalaTeacherService;
import com.newhead.balabala.modules.balabalateacher.base.repository.dao.BalabalaTeacherMapper;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师服务
 * 2017年12月28日 06:54:52
 */
@Api(tags = "教师", description = "相关的API")
@Service
public class SimpleBalabalaTeacherService extends AbstractBalabalaTeacherService {

    @Autowired
    private BalabalaTeacherMapper mapper;

    @Override
    protected BalabalaTeacherMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTeacher entity) {

    }
}
