package com.newhead.sc.modules.scdevice.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.sc.modules.scdevice.base.repository.entity.ScDevice;
import com.newhead.sc.modules.scdevice.ext.SimpleScDeviceService;
import com.newhead.sc.modules.scdevice.ext.protocol.*;

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
 * 设备控制器
 * 2017年12月13日 12:17:49
 */
@Api(tags = "设备", description = "相关的API")
public abstract class AbstractScDeviceController extends WebController  {

    protected abstract SimpleScDeviceService getService();

    /**
     * 创建设备
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleScDeviceCreateRequest request) {
        ScDevice scdevice = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", scdevice.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新设备
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleScDeviceUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到设备对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleScDeviceGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleScDeviceGetDetailResponse>(response);
    }

    /**
     * 删除设备ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "设备ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到设备列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "设备ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleScDeviceQueryResponse>> getList(@RequestParam(required = false) String deviceName,@RequestParam(required = false) String vendor,@RequestParam(required = false) String model,@RequestParam(required = false) String image,@RequestParam(required = false) String installLocation,@RequestParam(required = false) String config) {
        SimpleScDeviceQueryListRequest request = new SimpleScDeviceQueryListRequest();
        if (!StringUtils.isEmpty(deviceName)) {
            request.setDeviceName(deviceName);
        }
        if (!StringUtils.isEmpty(vendor)) {
            request.setVendor(vendor);
        }
        if (!StringUtils.isEmpty(model)) {
            request.setModel(model);
        }
        if (!StringUtils.isEmpty(image)) {
            request.setImage(image);
        }
        if (!StringUtils.isEmpty(installLocation)) {
            request.setInstallLocation(installLocation);
        }
        if (!StringUtils.isEmpty(config)) {
            request.setConfig(config);
        }
        List<SimpleScDeviceQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleScDeviceQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String deviceName,
        @RequestParam(required = false) String vendor,
        @RequestParam(required = false) String model,
        @RequestParam(required = false) String image,
        @RequestParam(required = false) String installLocation,
        @RequestParam(required = false) String config,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleScDeviceQueryPageRequest request = new SimpleScDeviceQueryPageRequest();
        if (!StringUtils.isEmpty(deviceName)) {
            request.setDeviceName(deviceName);
        }
        if (!StringUtils.isEmpty(vendor)) {
            request.setVendor(vendor);
        }
        if (!StringUtils.isEmpty(model)) {
            request.setModel(model);
        }
        if (!StringUtils.isEmpty(image)) {
            request.setImage(image);
        }
        if (!StringUtils.isEmpty(installLocation)) {
            request.setInstallLocation(installLocation);
        }
        if (!StringUtils.isEmpty(config)) {
            request.setConfig(config);
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
        Page<SimpleScDeviceQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}