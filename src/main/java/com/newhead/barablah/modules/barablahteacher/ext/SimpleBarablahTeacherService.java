package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherService;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.SimpleBarablahTeacherUpdateBatchRequest;
import io.swagger.annotations.Api;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * RudderFramework 自动生成
 * 教师服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "教师", description = "相关的API")
@Service
public class SimpleBarablahTeacherService extends AbstractBarablahTeacherService {

    @Autowired
    private BarablahTeacherMapper mapper;

    @Override
    public BarablahTeacherMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacher entity) {

    }

    @Transactional
    public void updatebatch(SimpleBarablahTeacherUpdateBatchRequest request) {
        if (CollectionUtils.isNotEmpty(request.getTeacherIds())) {
            for (Long teacherId : request.getTeacherIds()) {
                BarablahTeacher teacherToBeUpdated = new BarablahTeacher();
                teacherToBeUpdated.setId(teacherId);
                teacherToBeUpdated.setStatus(request.getStatus());
                mapper.updateByPrimaryKeySelective(teacherToBeUpdated);
            }
        }
    }
}
