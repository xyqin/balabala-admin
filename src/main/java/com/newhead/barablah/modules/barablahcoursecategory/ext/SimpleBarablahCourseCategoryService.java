package com.newhead.barablah.modules.barablahcoursecategory.ext;

import com.newhead.barablah.modules.barablahcourse.base.repository.dao.BarablahCourseMapper;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourseExample;
import com.newhead.barablah.modules.barablahcoursecategory.base.AbstractBarablahCourseCategoryService;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.dao.BarablahCourseCategoryMapper;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 课程分类服务
 * 2018年01月25日 02:58:38
 */
@Api(tags = "课程分类", description = "相关的API")
@Service
public class SimpleBarablahCourseCategoryService extends AbstractBarablahCourseCategoryService {

    @Autowired
    private BarablahCourseCategoryMapper mapper;


    @Autowired
    private BarablahCourseMapper courseMapper;
    @Override
    protected BarablahCourseCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCourseCategory entity) {

    }


    @Override
    public void delete(Long id) {
        BarablahCourseExample bce = new BarablahCourseExample();
        bce.createCriteria().andCategoryIdEqualTo(id);
        long num = courseMapper.countByExample(bce);
        if (num>0) {
            throw new ApiException(ApiStatus.STATUS_400.getCode(), "类别已经使用,不允许删除!");
        }
        getMapper().deleteByPrimaryKey(id);
    }
}
