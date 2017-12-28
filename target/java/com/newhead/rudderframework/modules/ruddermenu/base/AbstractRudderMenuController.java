package com.newhead.rudderframework.modules.ruddermenu.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.ruddermenu.base.repository.entity.RudderMenu;
import com.newhead.rudderframework.modules.ruddermenu.ext.SimpleRudderMenuService;
import com.newhead.rudderframework.modules.ruddermenu.ext.protocol.*;

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
 * 菜单控制器
 * 2017年12月28日 01:55:50
 */
@Api(tags = "菜单", description = "相关的API")
public abstract class AbstractRudderMenuController extends WebController  {

    protected abstract SimpleRudderMenuService getService();

    /**
     * 创建菜单
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderMenuCreateRequest request) {
        RudderMenu ruddermenuName = getService().existByRuddermenuName(request.getRuddermenuName());
        if (ruddermenuName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"菜单名称'"+request.getRuddermenuName()+"'已经存在！");
        }
        RudderMenu ruddermenu = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", ruddermenu.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新菜单
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderMenuUpdateRequest request) {
        RudderMenu RuddermenuName = getService().existByRuddermenuName(request.getRuddermenuName());
        if (RuddermenuName != null && RuddermenuName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"菜单名称"+request.getRuddermenuName()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到菜单对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderMenuGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleRudderMenuGetDetailResponse>(response);
    }

    /**
     * 删除菜单ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到菜单列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "菜单ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderMenuQueryResponse>> getList(@RequestParam(required = false) String ruddermenuName) {
        SimpleRudderMenuQueryListRequest request = new SimpleRudderMenuQueryListRequest();
        if (!StringUtils.isEmpty(ruddermenuName)) {
            request.setRuddermenuName(ruddermenuName);
        }
        List<SimpleRudderMenuQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderMenuQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String ruddermenuName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleRudderMenuQueryPageRequest request = new SimpleRudderMenuQueryPageRequest();
        if (!StringUtils.isEmpty(ruddermenuName)) {
            request.setRuddermenuName(ruddermenuName);
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
        Page<SimpleRudderMenuQueryResponse> sources = getService().queryPage(request);
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