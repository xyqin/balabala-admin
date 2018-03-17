package com.newhead.barablah.modules.barablahteachermajor.ext;

import com.newhead.barablah.modules.barablahteachermajor.base.AbstractBarablahTeacherMajorService;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.dao.BarablahTeacherMajorMapper;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师专业服务
 * 2018年03月18日 01:59:11
 */
@Api(tags = "教师专业", description = "相关的API")
@Service
public class SimpleBarablahTeacherMajorService extends AbstractBarablahTeacherMajorService {

    @Autowired
    private BarablahTeacherMajorMapper mapper;

    @Override
    protected BarablahTeacherMajorMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacherMajor entity) {

    }
}
