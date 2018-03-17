package com.newhead.barablah.modules.barablahcoursecategory.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahcoursecategory.base.repository.entity.BarablahCourseCategory;
import com.newhead.barablah.modules.barablahcoursecategory.ext.SimpleBarablahCourseCategoryService;
import com.newhead.barablah.modules.barablahcoursecategory.ext.protocol.*;

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
 * 2018年03月18日 02:48:25
 */
@Api(tags = "课程分类", description = "相关的API")
public abstract class AbstractBarablahCourseCategoryController extends WebController  {

    protected abstract SimpleBarablahCourseCategoryService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahCourseCategoryCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahCourseCategoryUpdateRequest request) {
        return null;
    }
    /**
     * 创建课程分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahCourseCategoryCreateRequest request) {
        if (StringUtils.isEmpty(request.getCategoryName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称不能为空！");
        }









        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahCourseCategory barablahcoursecategory = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahcoursecategory.getId());
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
    public ApiEntity update(@RequestBody SimpleBarablahCourseCategoryUpdateRequest request) {

                if (StringUtils.isEmpty(request.getCategoryName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
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
        SimpleBarablahCourseCategoryGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahCourseCategoryGetDetailResponse>(response);
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
    public ApiEntity<List<SimpleBarablahCourseCategoryQueryResponse>> getList(@RequestParam(required = false) String categoryName) {
        SimpleBarablahCourseCategoryQueryListRequest request = new SimpleBarablahCourseCategoryQueryListRequest();
        if (!StringUtils.isEmpty(categoryName)) {
            request.setCategoryName(categoryName);
        }
        List<SimpleBarablahCourseCategoryQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahCourseCategoryQueryResponse>>(sources);
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
        SimpleBarablahCourseCategoryQueryPageRequest request = new SimpleBarablahCourseCategoryQueryPageRequest();
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
        Page<SimpleBarablahCourseCategoryQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}