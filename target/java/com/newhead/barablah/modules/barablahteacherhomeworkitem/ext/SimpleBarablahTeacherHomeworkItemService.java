package com.newhead.barablah.modules.barablahteacherhomeworkitem.ext;

import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.AbstractBarablahTeacherHomeworkItemService;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.dao.BarablahTeacherHomeworkItemMapper;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 教师发布作业题目表服务
 * 2018年02月06日 05:24:55
 */
@Api(tags = "教师发布作业题目表", description = "相关的API")
@Service
public class SimpleBarablahTeacherHomeworkItemService extends AbstractBarablahTeacherHomeworkItemService {

    @Autowired
    private BarablahTeacherHomeworkItemMapper mapper;

    @Override
    protected BarablahTeacherHomeworkItemMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacherHomeworkItem entity) {

    }
}
