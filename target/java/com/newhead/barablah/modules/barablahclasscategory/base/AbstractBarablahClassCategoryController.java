package com.newhead.barablah.modules.barablahclasscategory.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.ext.SimpleBarablahClassCategoryService;
import com.newhead.barablah.modules.barablahclasscategory.ext.protocol.*;

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
 * 班级分类控制器
 * 2018年02月06日 03:55:40
 */
@Api(tags = "班级分类", description = "相关的API")
public abstract class AbstractBarablahClassCategoryController extends WebController  {

    protected abstract SimpleBarablahClassCategoryService getService();

    /**
     * 创建班级分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahClassCategoryCreateRequest request) {
        BarablahClassCategory barablahclasscategory = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahclasscategory.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新班级分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahClassCategoryUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到班级分类对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahClassCategoryGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahClassCategoryGetDetailResponse>(response);
    }

    /**
     * 删除班级分类ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "班级分类ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到班级分类列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "班级分类ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahClassCategoryQueryResponse>> getList(@RequestParam(required = false) String categoryName) {
        SimpleBarablahClassCategoryQueryListRequest request = new SimpleBarablahClassCategoryQueryListRequest();
        if (!StringUtils.isEmpty(categoryName)) {
            request.setCategoryName(categoryName);
        }
        List<SimpleBarablahClassCategoryQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahClassCategoryQueryResponse>>(sources);
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
        SimpleBarablahClassCategoryQueryPageRequest request = new SimpleBarablahClassCategoryQueryPageRequest();
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
        Page<SimpleBarablahClassCategoryQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}