package com.newhead.balabala.modules.balabalatextbookcategory.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalatextbookcategory.base.repository.entity.BalabalaTextbookCategory;
import com.newhead.balabala.modules.balabalatextbookcategory.ext.SimpleBalabalaTextbookCategoryService;
import com.newhead.balabala.modules.balabalatextbookcategory.ext.protocol.*;

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
 * 教材分类表控制器
 * 2017年12月28日 05:00:58
 */
@Api(tags = "教材分类表", description = "相关的API")
public abstract class AbstractBalabalaTextbookCategoryController extends WebController  {

    protected abstract SimpleBalabalaTextbookCategoryService getService();

    /**
     * 创建教材分类表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaTextbookCategoryCreateRequest request) {
        BalabalaTextbookCategory categoryName = getService().existByCategoryName(request.getCategoryName());
        if (categoryName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称'"+request.getCategoryName()+"'已经存在！");
        }
        BalabalaTextbookCategory path = getService().existByPath(request.getPath());
        if (path != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类路径'"+request.getPath()+"'已经存在！");
        }
        BalabalaTextbookCategory balabalatextbookcategory = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalatextbookcategory.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教材分类表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaTextbookCategoryUpdateRequest request) {
        BalabalaTextbookCategory CategoryName = getService().existByCategoryName(request.getCategoryName());
        if (CategoryName != null && CategoryName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称"+request.getCategoryName()+"'已经存在！");
        }
        BalabalaTextbookCategory Path = getService().existByPath(request.getPath());
        if (Path != null && Path.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类路径"+request.getPath()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教材分类表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaTextbookCategoryGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaTextbookCategoryGetDetailResponse>(response);
    }

    /**
     * 删除教材分类表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教材分类表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教材分类表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教材分类表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaTextbookCategoryQueryResponse>> getList() {
        SimpleBalabalaTextbookCategoryQueryListRequest request = new SimpleBalabalaTextbookCategoryQueryListRequest();
        List<SimpleBalabalaTextbookCategoryQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaTextbookCategoryQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaTextbookCategoryQueryPageRequest request = new SimpleBalabalaTextbookCategoryQueryPageRequest();
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
        Page<SimpleBalabalaTextbookCategoryQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}