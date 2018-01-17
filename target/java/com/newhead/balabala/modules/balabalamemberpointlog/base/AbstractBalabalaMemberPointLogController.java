package com.newhead.balabala.modules.balabalamemberpointlog.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamemberpointlog.base.repository.entity.BalabalaMemberPointLog;
import com.newhead.balabala.modules.balabalamemberpointlog.ext.SimpleBalabalaMemberPointLogService;
import com.newhead.balabala.modules.balabalamemberpointlog.ext.protocol.*;

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
 * 会员积分日志表控制器
 * 2018年01月17日 05:42:36
 */
@Api(tags = "会员积分日志表", description = "相关的API")
public abstract class AbstractBalabalaMemberPointLogController extends WebController  {

    protected abstract SimpleBalabalaMemberPointLogService getService();

    /**
     * 创建会员积分日志表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberPointLogCreateRequest request) {
        BalabalaMemberPointLog balabalamemberpointlog = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamemberpointlog.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员积分日志表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberPointLogUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员积分日志表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberPointLogGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberPointLogGetDetailResponse>(response);
    }

    /**
     * 删除会员积分日志表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员积分日志表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员积分日志表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员积分日志表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberPointLogQueryResponse>> getList(@RequestParam(required = false) String type) {
        SimpleBalabalaMemberPointLogQueryListRequest request = new SimpleBalabalaMemberPointLogQueryListRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        List<SimpleBalabalaMemberPointLogQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberPointLogQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String type,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaMemberPointLogQueryPageRequest request = new SimpleBalabalaMemberPointLogQueryPageRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
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
        Page<SimpleBalabalaMemberPointLogQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}