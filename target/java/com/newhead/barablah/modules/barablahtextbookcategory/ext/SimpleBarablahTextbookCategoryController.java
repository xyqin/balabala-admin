package com.newhead.barablah.modules.barablahtextbookcategory.ext;

import com.newhead.barablah.modules.barablahtextbookcategory.base.AbstractBarablahTextbookCategoryController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * RudderFramework 自动生成
 * 教材分类表控制
 * 2018年02月07日 04:00:56
 */
@Api(tags = "教材分类表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahtextbookcategory", method = RequestMethod.GET)
public class SimpleBarablahTextbookCategoryController extends AbstractBarablahTextbookCategoryController {
    @Autowired
    private SimpleBarablahTextbookCategoryService service;

    @Override
    public SimpleBarablahTextbookCategoryService getService() {
        return service;
    }
}
