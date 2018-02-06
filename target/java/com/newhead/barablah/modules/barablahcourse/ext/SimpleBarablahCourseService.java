package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseService;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 课程服务
 * 2018年02月06日 05:24:55
 */
@Api(tags = "课程", description = "相关的API")
@Service
public class SimpleBarablahCourseService extends AbstractBarablahCourseService {

    @Autowired
    private BarablahCourseMapper mapper;

    @Override
    protected BarablahCourseMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCourse entity) {

    }
}
