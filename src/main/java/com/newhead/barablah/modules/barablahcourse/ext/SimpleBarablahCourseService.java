package com.newhead.barablah.modules.barablahcourse.ext;

import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahcourse.base.AbstractBarablahCourseService;
import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 课程服务
 * 2018年01月18日 06:52:58
 */
@Api(tags = "课程", description = "相关的API")
@Service
public class SimpleBarablahCourseService extends AbstractBarablahCourseService {

    @Autowired
    private BarablahCourseMapper mapper;

    @Autowired
    private BarablahClassMapper classMapper;

    @Override
    protected BarablahCourseMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCourse entity) {

    }

    @Override
    public void delete(Long id) {
        BarablahClassExample bce = new BarablahClassExample();
        bce.createCriteria().andCourseIdEqualTo(id);

        long num = classMapper.countByExample(bce);
        if (num>0) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "课程已经在开班里使用,不允许删除!");
        }

        getMapper().deleteByPrimaryKey(id);
    }
}
