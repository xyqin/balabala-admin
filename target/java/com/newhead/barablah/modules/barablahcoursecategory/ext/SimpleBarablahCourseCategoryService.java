package com.newhead.barablah.modules.barablahcoursecategory.ext;

import com.newhead.barablah.modules.barablahcoursecategory.base.AbstractBarablahCourseCategoryService;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.dao.BarablahCourseCategoryMapper;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 课程分类服务
 * 2018年02月06日 03:38:23
 */
@Api(tags = "课程分类", description = "相关的API")
@Service
public class SimpleBarablahCourseCategoryService extends AbstractBarablahCourseCategoryService {

    @Autowired
    private BarablahCourseCategoryMapper mapper;

    @Override
    protected BarablahCourseCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahCourseCategory entity) {

    }
}
