package com.newhead.balabala.modules.balabalacourse.ext;

import com.newhead.balabala.modules.balabalacourse.base.AbstractBalabalaCourseService;
import com.newhead.balabala.modules.balabalacourse.base.repository.dao.BalabalaCourseMapper;
import com.newhead.balabala.modules.balabalacourse.base.repository.entity.BalabalaCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 课程服务
 * 2017年12月23日 02:12:57
 */
@Api(tags = "课程", description = "相关的API")
@Service
public class SimpleBalabalaCourseService extends AbstractBalabalaCourseService {

    @Autowired
    private BalabalaCourseMapper mapper;

    @Override
    protected BalabalaCourseMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaCourse entity) {

    }
}
