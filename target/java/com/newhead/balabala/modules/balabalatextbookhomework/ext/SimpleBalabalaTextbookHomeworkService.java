package com.newhead.balabala.modules.balabalatextbookhomework.ext;

import com.newhead.balabala.modules.balabalatextbookhomework.base.AbstractBalabalaTextbookHomeworkService;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.dao.BalabalaTextbookHomeworkMapper;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教材作业表服务
 * 2017年12月28日 12:00:28
 */
@Api(tags = "教材作业表", description = "相关的API")
@Service
public class SimpleBalabalaTextbookHomeworkService extends AbstractBalabalaTextbookHomeworkService {

    @Autowired
    private BalabalaTextbookHomeworkMapper mapper;

    @Override
    protected BalabalaTextbookHomeworkMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTextbookHomework entity) {

    }
}
