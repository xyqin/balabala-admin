package com.newhead.barablah.modules.barablahclasscategory.base;

import com.google.common.collect.Maps;
import com.newhead.barablah.modules.barablahclasscategory.base.repository.entity.BarablahClassCategory;
import com.newhead.barablah.modules.barablahclasscategory.ext.SimpleBarablahClassCategoryService;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.controller.WebController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 班级分类控制器
 * 2018年03月18日 05:08:31
 */
@Api(tags = "班级分类", description = "相关的API")
public abstract class AbstractBarablahClassCategoryController extends WebController  {

    protected abstract SimpleBarablahClassCategoryService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahClassCategoryCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahClassCategoryUpdateRequest request) {
        return null;
    }
    /**
     * 创建班级分类
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahClassCategoryCreateRequest request) {
        if (StringUtils.isEmpty(request.getCategoryName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称不能为空！");
        }


        if(request.getCategoryName()!=null) {
            BarablahClassCategory categoryName = getService().existByCategoryName(request.getCategoryName());
            if (categoryName != null) {
                throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称'"+request.getCategoryName()+"'已经存在！");
            }
        }







        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

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

                if (StringUtils.isEmpty(request.getCategoryName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称不能为空！");
                }


    if(request.getCategoryName()!=null) {

        BarablahClassCategory CategoryName = getService().existByCategoryName(request.getCategoryName());
        if (CategoryName != null && CategoryName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"分类名称"+request.getCategoryName()+"'已经存在！");
        }
    }


       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
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