package com.newhead.balabala.modules.balabalacoursecategory.ext;

import com.newhead.balabala.modules.balabalacoursecategory.base.AbstractBalabalaCourseCategoryController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 课程分类控制
 * 2017年12月28日 12:00:28
 */
@Api(tags = "课程分类", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalacoursecategory", method = RequestMethod.GET)
public class SimpleBalabalaCourseCategoryController extends AbstractBalabalaCourseCategoryController {
    @Autowired
    private SimpleBalabalaCourseCategoryService service;

    @Override
    public SimpleBalabalaCourseCategoryService getService() {
        return service;
    }
}
