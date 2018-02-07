package com.newhead.barablah.modules.barablahclasscategory.ext;

import com.newhead.barablah.modules.barablahclasscategory.base.AbstractBarablahClassCategoryController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 班级分类控制
 * 2018年02月07日 10:47:07
 */
@Api(tags = "班级分类", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclasscategory", method = RequestMethod.GET)
public class SimpleBarablahClassCategoryController extends AbstractBarablahClassCategoryController {
    @Autowired
    private SimpleBarablahClassCategoryService service;

    @Override
    public SimpleBarablahClassCategoryService getService() {
        return service;
    }
}
