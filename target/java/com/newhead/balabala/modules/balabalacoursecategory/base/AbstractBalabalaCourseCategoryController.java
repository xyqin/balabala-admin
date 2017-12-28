package com.newhead.balabala.modules.balabalacoursecategory.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalacoursecategory.base.repository.entity.BalabalaCourseCategory;
import com.newhead.balabala.modules.balabalacoursecategory.ext.SimpleBalabalaCourseCategoryService;
import com.newhead.balabala.modules.balabalacoursecategory.ext.protocol.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 课程分类控制器
 * 2017年12月28日 03:59:22
 */
@Api(tags = "课程分类", description = "相关的API")
public abstract class AbstractBalabalaCourseCategoryController extends WebController  {

    protected abstract SimpleBalabalaCourseCategoryService getService();

    /**
     * 创建课程分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaCourseCategoryCreateRequest request) {
        BalabalaCourseCategory balabalacoursecategory = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalacoursecategory.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新课程分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaCourseCategoryUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到课程分类对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaCourseCategoryGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaCourseCategoryGetDetailResponse>(response);
    }

    /**
     * 删除课程分类ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "课程分类ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到课程分类列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "课程分类ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaCourseCategoryQueryResponse>> getList(@RequestParam(required = false) String categoryName) {
        SimpleBalabalaCourseCategoryQueryListRequest request = new SimpleBalabalaCourseCategoryQueryListRequest();
        if (!StringUtils.isEmpty(categoryName)) {
            request.setCategoryName(categoryName);
        }
        List<SimpleBalabalaCourseCategoryQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaCourseCategoryQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String categoryName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaCourseCategoryQueryPageRequest request = new SimpleBalabalaCourseCategoryQueryPageRequest();
        if (!StringUtils.isEmpty(categoryName)) {
            request.setCategoryName(categoryName);
        }
        if (page==null) {
            request.setPage(1);
        } else {
            request.setPage(page);
        }
        if (size==null) {
            request.setPage(10);
        } else  {
            request.setSize(size);
        }
        Page<SimpleBalabalaCourseCategoryQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}