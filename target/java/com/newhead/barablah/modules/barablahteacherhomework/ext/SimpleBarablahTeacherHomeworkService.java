package com.newhead.barablah.modules.barablahteacherhomework.ext;

import com.newhead.barablah.modules.barablahteacherhomework.base.AbstractBarablahTeacherHomeworkService;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.dao.BarablahTeacherHomeworkMapper;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师发布作业表服务
 * 2018年01月25日 02:58:38
 */
@Api(tags = "教师发布作业表", description = "相关的API")
@Service
public class SimpleBarablahTeacherHomeworkService extends AbstractBarablahTeacherHomeworkService {

    @Autowired
    private BarablahTeacherHomeworkMapper mapper;

    @Override
    protected BarablahTeacherHomeworkMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacherHomework entity) {

    }
}
