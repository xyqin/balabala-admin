package com.newhead.balabala.modules.balabalatextbookcategory.ext;

import com.newhead.balabala.modules.balabalatextbookcategory.base.AbstractBalabalaTextbookCategoryController;

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
 * 2017年12月28日 01:55:48
 */
@Api(tags = "教材分类表", description = "相关的API")
@RestController
@RequestMapping(value = "/balabalatextbookcategory", method = RequestMethod.GET)
public class SimpleBalabalaTextbookCategoryController extends AbstractBalabalaTextbookCategoryController {
    @Autowired
    private SimpleBalabalaTextbookCategoryService service;

    @Override
    public SimpleBalabalaTextbookCategoryService getService() {
        return service;
    }
}
