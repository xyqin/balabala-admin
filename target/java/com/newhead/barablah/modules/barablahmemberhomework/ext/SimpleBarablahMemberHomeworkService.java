package com.newhead.barablah.modules.barablahmemberhomework.ext;

import com.newhead.barablah.modules.barablahmemberhomework.base.AbstractBarablahMemberHomeworkService;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.dao.BarablahMemberHomeworkMapper;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 学生作业表服务
 * 2018年01月25日 01:52:20
 */
@Api(tags = "学生作业表", description = "相关的API")
@Service
public class SimpleBarablahMemberHomeworkService extends AbstractBarablahMemberHomeworkService {

    @Autowired
    private BarablahMemberHomeworkMapper mapper;

    @Override
    protected BarablahMemberHomeworkMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberHomework entity) {

    }
}
