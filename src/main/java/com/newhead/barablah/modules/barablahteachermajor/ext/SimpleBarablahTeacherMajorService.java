package com.newhead.barablah.modules.barablahteachermajor.ext;

import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.barablah.modules.barablahteachermajor.base.AbstractBarablahTeacherMajorService;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.dao.BarablahTeacherMajorMapper;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Autowired
    private BarablahTeacherMapper teacherMapper;

    @Override
    protected BarablahTeacherMajorMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahTeacherMajor entity) {

    }

    /**
     *
     * @param id
     */
    public void delete(Long id) {
        BarablahTeacherExample example = new BarablahTeacherExample();
        example.createCriteria().andMajorEqualTo(id);
        if (teacherMapper.countByExample(example)>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"专业已经被使用不允许删除!!!");
        }
        getMapper().deleteByPrimaryKey(id);
    }
}
