package com.newhead.balabala.modules.balabalateacherhomeworkitem.ext;

import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.AbstractBalabalaTeacherHomeworkItemService;
import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.repository.dao.BalabalaTeacherHomeworkItemMapper;
import com.newhead.balabala.modules.balabalateacherhomeworkitem.base.repository.entity.BalabalaTeacherHomeworkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师发布作业题目表服务
 * 2017年12月28日 07:22:03
 */
@Api(tags = "教师发布作业题目表", description = "相关的API")
@Service
public class SimpleBalabalaTeacherHomeworkItemService extends AbstractBalabalaTeacherHomeworkItemService {

    @Autowired
    private BalabalaTeacherHomeworkItemMapper mapper;

    @Override
    protected BalabalaTeacherHomeworkItemMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaTeacherHomeworkItem entity) {

    }
}
