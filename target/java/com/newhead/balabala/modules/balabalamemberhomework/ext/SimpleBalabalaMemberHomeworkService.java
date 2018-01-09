package com.newhead.balabala.modules.balabalamemberhomework.ext;

import com.newhead.balabala.modules.balabalamemberhomework.base.AbstractBalabalaMemberHomeworkService;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.dao.BalabalaMemberHomeworkMapper;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 学生作业表服务
 * 2018年01月09日 04:35:22
 */
@Api(tags = "学生作业表", description = "相关的API")
@Service
public class SimpleBalabalaMemberHomeworkService extends AbstractBalabalaMemberHomeworkService {

    @Autowired
    private BalabalaMemberHomeworkMapper mapper;

    @Override
    protected BalabalaMemberHomeworkMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaMemberHomework entity) {

    }
}
