package com.newhead.balabala.modules.balabalacoursecategory.ext;

import com.newhead.balabala.modules.balabalacoursecategory.base.AbstractBalabalaCourseCategoryService;
import com.newhead.balabala.modules.balabalacoursecategory.base.repository.dao.BalabalaCourseCategoryMapper;
import com.newhead.balabala.modules.balabalacoursecategory.base.repository.entity.BalabalaCourseCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 课程分类服务
 * 2017年12月28日 03:59:20
 */
@Api(tags = "课程分类", description = "相关的API")
@Service
public class SimpleBalabalaCourseCategoryService extends AbstractBalabalaCourseCategoryService {

    @Autowired
    private BalabalaCourseCategoryMapper mapper;

    @Override
    protected BalabalaCourseCategoryMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BalabalaCourseCategory entity) {

    }
}
