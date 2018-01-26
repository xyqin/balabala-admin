package com.newhead.rudderframework.modules.rudderuser2role.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import com.newhead.rudderframework.modules.rudderuser2role.ext.SimpleRudderUser2roleService;
import com.newhead.rudderframework.modules.rudderuser2role.ext.protocol.*;

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
 * 用户角色关系控制器
 * 2018年01月26日 03:39:50
 */
@Api(tags = "用户角色关系", description = "相关的API")
public abstract class AbstractRudderUser2roleController extends WebController  {

    protected abstract SimpleRudderUser2roleService getService();

    /**
     * 创建用户角色关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderUser2roleCreateRequest request) {
        RudderUser2role rudderuser2role = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", rudderuser2role.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新用户角色关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderUser2roleUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到用户角色关系对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderUser2roleGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleRudderUser2roleGetDetailResponse>(response);
    }

    /**
     * 删除用户角色关系ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "用户角色关系ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到用户角色关系列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "用户角色关系ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderUser2roleQueryResponse>> getList() {
        SimpleRudderUser2roleQueryListRequest request = new SimpleRudderUser2roleQueryListRequest();
        List<SimpleRudderUser2roleQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderUser2roleQueryResponse>>(sources);
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
        SimpleRudderUser2roleQueryPageRequest request = new SimpleRudderUser2roleQueryPageRequest();
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
        Page<SimpleRudderUser2roleQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}