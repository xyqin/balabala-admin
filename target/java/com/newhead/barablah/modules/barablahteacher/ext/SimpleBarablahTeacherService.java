package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherService;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师服务
 * 2018年01月25日 03:24:34
 */
@Api(tags = "教师", description = "相关的API")
@Service
public class SimpleBarablahTeacherService extends AbstractBarablahTeacherService {

    @Autowired
    private BarablahTeacherMapper mapper;

    @Override
    protected BarablahTeacherMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacher entity) {

    }
}
