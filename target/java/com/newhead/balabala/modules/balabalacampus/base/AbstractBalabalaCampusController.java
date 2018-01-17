package com.newhead.balabala.modules.balabalacampus.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalacampus.base.repository.entity.BalabalaCampus;
import com.newhead.balabala.modules.balabalacampus.ext.SimpleBalabalaCampusService;
import com.newhead.balabala.modules.balabalacampus.ext.protocol.*;

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
 * 校区控制器
 * 2018年01月17日 05:42:36
 */
@Api(tags = "校区", description = "相关的API")
public abstract class AbstractBalabalaCampusController extends WebController  {

    protected abstract SimpleBalabalaCampusService getService();

    /**
     * 创建校区
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaCampusCreateRequest request) {
        BalabalaCampus balabalacampus = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalacampus.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新校区
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaCampusUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到校区对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaCampusGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaCampusGetDetailResponse>(response);
    }

    /**
     * 删除校区ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "校区ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到校区列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "校区ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaCampusQueryResponse>> getList(@RequestParam(required = false) String campusName) {
        SimpleBalabalaCampusQueryListRequest request = new SimpleBalabalaCampusQueryListRequest();
        if (!StringUtils.isEmpty(campusName)) {
            request.setCampusName(campusName);
        }
        List<SimpleBalabalaCampusQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaCampusQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String campusName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaCampusQueryPageRequest request = new SimpleBalabalaCampusQueryPageRequest();
        if (!StringUtils.isEmpty(campusName)) {
            request.setCampusName(campusName);
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
        Page<SimpleBalabalaCampusQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}