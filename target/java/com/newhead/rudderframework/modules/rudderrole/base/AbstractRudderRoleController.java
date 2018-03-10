package com.newhead.rudderframework.modules.rudderrole.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import com.newhead.rudderframework.modules.rudderrole.ext.SimpleRudderRoleService;
import com.newhead.rudderframework.modules.rudderrole.ext.protocol.*;

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
 * 角色控制器
 * 2018年03月10日 07:58:17
 */
@Api(tags = "角色", description = "相关的API")
public abstract class AbstractRudderRoleController extends WebController  {

    protected abstract SimpleRudderRoleService getService();

    /**
     * 创建角色
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderRoleCreateRequest request) {
        RudderRole rudderroleName = getService().existByRudderroleName(request.getRudderroleName());
        if (rudderroleName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称'"+request.getRudderroleName()+"'已经存在！");
        }
        RudderRole code = getService().existByCode(request.getCode());
        if (code != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"角色代码'"+request.getCode()+"'已经存在！");
        }
        RudderRole rudderrole = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", rudderrole.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新角色
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderRoleUpdateRequest request) {
        RudderRole RudderroleName = getService().existByRudderroleName(request.getRudderroleName());
        if (RudderroleName != null && RudderroleName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源名称"+request.getRudderroleName()+"'已经存在！");
        }
        RudderRole Code = getService().existByCode(request.getCode());
        if (Code != null && Code.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"角色代码"+request.getCode()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到角色对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderRoleGetDetailResponse response =  getService().getDetail(id);
        Tree items = getService().getRudderPermissions(id);
        response.setRudderPermissionItems(items);
        return new ApiEntity<SimpleRudderRoleGetDetailResponse>(response);
    }

    /**
     * 删除角色ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "角色ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到角色列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "角色ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderRoleQueryResponse>> getList(@RequestParam(required = false) String rudderroleName) {
        SimpleRudderRoleQueryListRequest request = new SimpleRudderRoleQueryListRequest();
        if (!StringUtils.isEmpty(rudderroleName)) {
            request.setRudderroleName(rudderroleName);
        }
        List<SimpleRudderRoleQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderRoleQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String rudderroleName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleRudderRoleQueryPageRequest request = new SimpleRudderRoleQueryPageRequest();
        if (!StringUtils.isEmpty(rudderroleName)) {
            request.setRudderroleName(rudderroleName);
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
        Page<SimpleRudderRoleQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}