package com.newhead.rudderframework.modules.rudderpermission.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import com.newhead.rudderframework.modules.rudderpermission.ext.SimpleRudderPermissionService;
import com.newhead.rudderframework.modules.rudderpermission.ext.protocol.*;

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
 * 权限控制器
 * 2018年01月25日 01:52:23
 */
@Api(tags = "权限", description = "相关的API")
public abstract class AbstractRudderPermissionController extends WebController  {

    protected abstract SimpleRudderPermissionService getService();

    /**
     * 创建权限
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderPermissionCreateRequest request) {
        RudderPermission rudderpermissionName = getService().existByRudderpermissionName(request.getRudderpermissionName());
        if (rudderpermissionName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称'"+request.getRudderpermissionName()+"'已经存在！");
        }
        RudderPermission rudderpermission = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", rudderpermission.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新权限
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderPermissionUpdateRequest request) {
        RudderPermission RudderpermissionName = getService().existByRudderpermissionName(request.getRudderpermissionName());
        if (RudderpermissionName != null && RudderpermissionName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称"+request.getRudderpermissionName()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到权限对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderPermissionGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleRudderPermissionGetDetailResponse>(response);
    }

    /**
     * 删除权限ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "权限ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到权限列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "权限ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderPermissionQueryResponse>> getList(@RequestParam(required = false) String rudderpermissionName) {
        SimpleRudderPermissionQueryListRequest request = new SimpleRudderPermissionQueryListRequest();
        if (!StringUtils.isEmpty(rudderpermissionName)) {
            request.setRudderpermissionName(rudderpermissionName);
        }
        List<SimpleRudderPermissionQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderPermissionQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String rudderpermissionName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleRudderPermissionQueryPageRequest request = new SimpleRudderPermissionQueryPageRequest();
        if (!StringUtils.isEmpty(rudderpermissionName)) {
            request.setRudderpermissionName(rudderpermissionName);
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
        Page<SimpleRudderPermissionQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

        /**
         * 返回树结构对象
         *
         * @return
         */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "gettree", method = RequestMethod.GET)
    public ApiEntity getTree() {
        Tree tree = getService().getTree();
        return new ApiEntity<>(tree);
    }
}