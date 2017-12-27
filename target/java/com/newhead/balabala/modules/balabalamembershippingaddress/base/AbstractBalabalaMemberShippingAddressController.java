package com.newhead.balabala.modules.balabalamembershippingaddress.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamembershippingaddress.base.repository.entity.BalabalaMemberShippingAddress;
import com.newhead.balabala.modules.balabalamembershippingaddress.ext.SimpleBalabalaMemberShippingAddressService;
import com.newhead.balabala.modules.balabalamembershippingaddress.ext.protocol.*;

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
 * 收货地址控制器
 * 2017年12月28日 12:00:30
 */
@Api(tags = "收货地址", description = "相关的API")
public abstract class AbstractBalabalaMemberShippingAddressController extends WebController  {

    protected abstract SimpleBalabalaMemberShippingAddressService getService();

    /**
     * 创建收货地址
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberShippingAddressCreateRequest request) {
        BalabalaMemberShippingAddress balabalamembershippingaddress = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamembershippingaddress.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新收货地址
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberShippingAddressUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到收货地址对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberShippingAddressGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberShippingAddressGetDetailResponse>(response);
    }

    /**
     * 删除收货地址ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "收货地址ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到收货地址列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "收货地址ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberShippingAddressQueryResponse>> getList() {
        SimpleBalabalaMemberShippingAddressQueryListRequest request = new SimpleBalabalaMemberShippingAddressQueryListRequest();
        List<SimpleBalabalaMemberShippingAddressQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberShippingAddressQueryResponse>>(sources);
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
        SimpleBalabalaMemberShippingAddressQueryPageRequest request = new SimpleBalabalaMemberShippingAddressQueryPageRequest();
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
        Page<SimpleBalabalaMemberShippingAddressQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}