package com.newhead.rudderframework.modules.rudderrole2permission.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import com.newhead.rudderframework.modules.rudderrole2permission.ext.SimpleRudderRole2permissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 角色权限关系控制器
 * 2018年03月18日 05:08:33
 */
@Api(tags = "角色权限关系", description = "相关的API")
public abstract class AbstractRudderRole2permissionController extends WebController  {

    protected abstract SimpleRudderRole2permissionService getService();
    protected ApiEntity fillCreateRequest(SimpleRudderRole2permissionCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleRudderRole2permissionUpdateRequest request) {
        return null;
    }
    /**
     * 创建角色权限关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderRole2permissionCreateRequest request) {
        if (StringUtils.isEmpty(request.getRudderpermissionId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源编码不能为空！");
        }

        if (StringUtils.isEmpty(request.getRudderroleId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"角色不能为空！");
        }

        if (StringUtils.isEmpty(request.getVisible())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否显示不能为空！");
        }











        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        RudderRole2permission rudderrole2permission = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", rudderrole2permission.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新角色权限关系
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderRole2permissionUpdateRequest request) {

                if (StringUtils.isEmpty(request.getRudderpermissionId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"资源编码不能为空！");
                }

                if (StringUtils.isEmpty(request.getRudderroleId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"角色不能为空！");
                }

                if (StringUtils.isEmpty(request.getVisible())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否显示不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到角色权限关系对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderRole2permissionGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleRudderRole2permissionGetDetailResponse>(response);
    }

    /**
     * 删除角色权限关系ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "角色权限关系ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到角色权限关系列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "角色权限关系ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderRole2permissionQueryResponse>> getList() {
        SimpleRudderRole2permissionQueryListRequest request = new SimpleRudderRole2permissionQueryListRequest();
        List<SimpleRudderRole2permissionQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderRole2permissionQueryResponse>>(sources);
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
        SimpleRudderRole2permissionQueryPageRequest request = new SimpleRudderRole2permissionQueryPageRequest();
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
        Page<SimpleRudderRole2permissionQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}