package com.newhead.barablah.modules.barablahposition.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahposition.base.repository.entity.BarablahPosition;
import com.newhead.barablah.modules.barablahposition.ext.SimpleBarablahPositionService;
import com.newhead.barablah.modules.barablahposition.ext.protocol.*;

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
 * 广告位置表控制器
 * 2018年03月06日 04:53:33
 */
@Api(tags = "广告位置表", description = "相关的API")
public abstract class AbstractBarablahPositionController extends WebController  {

    protected abstract SimpleBarablahPositionService getService();

    /**
     * 创建广告位置表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahPositionCreateRequest request) {
        BarablahPosition barablahposition = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahposition.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新广告位置表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahPositionUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到广告位置表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahPositionGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahPositionGetDetailResponse>(response);
    }

    /**
     * 删除广告位置表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "广告位置表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到广告位置表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "广告位置表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahPositionQueryResponse>> getList(@RequestParam(required = false) String positionName) {
        SimpleBarablahPositionQueryListRequest request = new SimpleBarablahPositionQueryListRequest();
        if (!StringUtils.isEmpty(positionName)) {
            request.setPositionName(positionName);
        }
        List<SimpleBarablahPositionQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahPositionQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String positionName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahPositionQueryPageRequest request = new SimpleBarablahPositionQueryPageRequest();
        if (!StringUtils.isEmpty(positionName)) {
            request.setPositionName(positionName);
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
        Page<SimpleBarablahPositionQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}