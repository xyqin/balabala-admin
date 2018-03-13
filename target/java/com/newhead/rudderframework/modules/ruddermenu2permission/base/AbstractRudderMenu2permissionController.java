package com.newhead.rudderframework.modules.ruddermenu2permission.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import com.newhead.rudderframework.modules.ruddermenu2permission.ext.SimpleRudderMenu2permissionService;
import com.newhead.rudderframework.modules.ruddermenu2permission.ext.protocol.*;

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
 * 菜单权限关系控制器
 * 2018年03月13日 07:57:10
 */
@Api(tags = "菜单权限关系", description = "相关的API")
public abstract class AbstractRudderMenu2permissionController extends WebController  {

    protected abstract SimpleRudderMenu2permissionService getService();
    protected ApiEntity fillCreateRequest(SimpleRudderMenu2permissionCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleRudderMenu2permissionUpdateRequest request) {
        return null;
    }
    /**
     * 创建菜单权限关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderMenu2permissionCreateRequest request) {

        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        RudderMenu2permission ruddermenu2permission = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", ruddermenu2permission.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新菜单权限关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderMenu2permissionUpdateRequest request) {



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到菜单权限关系对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderMenu2permissionGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleRudderMenu2permissionGetDetailResponse>(response);
    }

    /**
     * 删除菜单权限关系ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "菜单权限关系ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到菜单权限关系列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "菜单权限关系ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderMenu2permissionQueryResponse>> getList() {
        SimpleRudderMenu2permissionQueryListRequest request = new SimpleRudderMenu2permissionQueryListRequest();
        List<SimpleRudderMenu2permissionQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderMenu2permissionQueryResponse>>(sources);
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
        SimpleRudderMenu2permissionQueryPageRequest request = new SimpleRudderMenu2permissionQueryPageRequest();
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
        Page<SimpleRudderMenu2permissionQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}