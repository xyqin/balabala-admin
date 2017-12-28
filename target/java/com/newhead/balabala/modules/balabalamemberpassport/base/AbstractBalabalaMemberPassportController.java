package com.newhead.balabala.modules.balabalamemberpassport.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamemberpassport.base.repository.entity.BalabalaMemberPassport;
import com.newhead.balabala.modules.balabalamemberpassport.ext.SimpleBalabalaMemberPassportService;
import com.newhead.balabala.modules.balabalamemberpassport.ext.protocol.*;

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
 * 会员通行证控制器
 * 2017年12月28日 01:55:50
 */
@Api(tags = "会员通行证", description = "相关的API")
public abstract class AbstractBalabalaMemberPassportController extends WebController  {

    protected abstract SimpleBalabalaMemberPassportService getService();

    /**
     * 创建会员通行证
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberPassportCreateRequest request) {
        BalabalaMemberPassport balabalamemberpassport = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamemberpassport.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员通行证
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberPassportUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员通行证对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberPassportGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberPassportGetDetailResponse>(response);
    }

    /**
     * 删除会员通行证ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员通行证ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员通行证列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员通行证ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberPassportQueryResponse>> getList() {
        SimpleBalabalaMemberPassportQueryListRequest request = new SimpleBalabalaMemberPassportQueryListRequest();
        List<SimpleBalabalaMemberPassportQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberPassportQueryResponse>>(sources);
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
        SimpleBalabalaMemberPassportQueryPageRequest request = new SimpleBalabalaMemberPassportQueryPageRequest();
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
        Page<SimpleBalabalaMemberPassportQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}