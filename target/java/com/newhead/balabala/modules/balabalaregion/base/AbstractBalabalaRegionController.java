package com.newhead.balabala.modules.balabalaregion.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalaregion.base.repository.entity.BalabalaRegion;
import com.newhead.balabala.modules.balabalaregion.ext.SimpleBalabalaRegionService;
import com.newhead.balabala.modules.balabalaregion.ext.protocol.*;

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
 * 地区控制器
 * 2017年12月23日 02:12:59
 */
@Api(tags = "地区", description = "相关的API")
public abstract class AbstractBalabalaRegionController extends WebController  {

    protected abstract SimpleBalabalaRegionService getService();

    /**
     * 创建地区
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaRegionCreateRequest request) {
        BalabalaRegion regionName = getService().existByRegionName(request.getRegionName());
        if (regionName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"地区名称'"+request.getRegionName()+"'已经存在！");
        }
        BalabalaRegion balabalaregion = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalaregion.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新地区
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaRegionUpdateRequest request) {
        BalabalaRegion RegionName = getService().existByRegionName(request.getRegionName());
        if (RegionName != null && RegionName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"地区名称"+request.getRegionName()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到地区对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaRegionGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaRegionGetDetailResponse>(response);
    }

    /**
     * 删除地区ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "地区ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到地区列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "地区ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaRegionQueryResponse>> getList() {
        SimpleBalabalaRegionQueryListRequest request = new SimpleBalabalaRegionQueryListRequest();
        List<SimpleBalabalaRegionQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaRegionQueryResponse>>(sources);
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
        SimpleBalabalaRegionQueryPageRequest request = new SimpleBalabalaRegionQueryPageRequest();
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
        Page<SimpleBalabalaRegionQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}