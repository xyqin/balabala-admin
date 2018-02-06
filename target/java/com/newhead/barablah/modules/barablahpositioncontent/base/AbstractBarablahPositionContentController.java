package com.newhead.barablah.modules.barablahpositioncontent.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahpositioncontent.base.repository.entity.BarablahPositionContent;
import com.newhead.barablah.modules.barablahpositioncontent.ext.SimpleBarablahPositionContentService;
import com.newhead.barablah.modules.barablahpositioncontent.ext.protocol.*;

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
 * 位置内容表控制器
 * 2018年02月06日 03:58:40
 */
@Api(tags = "位置内容表", description = "相关的API")
public abstract class AbstractBarablahPositionContentController extends WebController  {

    protected abstract SimpleBarablahPositionContentService getService();

    /**
     * 创建位置内容表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahPositionContentCreateRequest request) {
        BarablahPositionContent barablahpositioncontent = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahpositioncontent.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新位置内容表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahPositionContentUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到位置内容表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahPositionContentGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahPositionContentGetDetailResponse>(response);
    }

    /**
     * 删除位置内容表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "位置内容表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到位置内容表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "位置内容表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahPositionContentQueryResponse>> getList(@RequestParam(required = false) Long positionId,@RequestParam(required = false) String contentName) {
        SimpleBarablahPositionContentQueryListRequest request = new SimpleBarablahPositionContentQueryListRequest();
        if (!StringUtils.isEmpty(positionId)) {
            request.setPositionId(positionId);
        }
        if (!StringUtils.isEmpty(contentName)) {
            request.setContentName(contentName);
        }
        List<SimpleBarablahPositionContentQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahPositionContentQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Long positionId,
        @RequestParam(required = false) String contentName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahPositionContentQueryPageRequest request = new SimpleBarablahPositionContentQueryPageRequest();
        if (!StringUtils.isEmpty(positionId)) {
            request.setPositionId(positionId);
        }
        if (!StringUtils.isEmpty(contentName)) {
            request.setContentName(contentName);
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
        Page<SimpleBarablahPositionContentQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}