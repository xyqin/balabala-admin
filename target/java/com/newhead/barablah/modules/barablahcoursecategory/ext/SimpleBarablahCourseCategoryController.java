package com.newhead.barablah.modules.barablahcoursecategory.ext;

import com.newhead.barablah.modules.barablahcoursecategory.base.AbstractBarablahCourseCategoryController;

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
 * 2018年02月07日 10:47:07
 */
@Api(tags = "课程分类", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahcoursecategory", method = RequestMethod.GET)
public class SimpleBarablahCourseCategoryController extends AbstractBarablahCourseCategoryController {
    @Autowired
    private SimpleBarablahCourseCategoryService service;

    @Override
    public SimpleBarablahCourseCategoryService getService() {
        return service;
    }
}
