package com.newhead.balabala.modules.balabalamemberhomework.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamemberhomework.base.repository.entity.BalabalaMemberHomework;
import com.newhead.balabala.modules.balabalamemberhomework.ext.SimpleBalabalaMemberHomeworkService;
import com.newhead.balabala.modules.balabalamemberhomework.ext.protocol.*;

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
 * 学生作业表控制器
 * 2017年12月28日 01:55:50
 */
@Api(tags = "学生作业表", description = "相关的API")
public abstract class AbstractBalabalaMemberHomeworkController extends WebController  {

    protected abstract SimpleBalabalaMemberHomeworkService getService();

    /**
     * 创建学生作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberHomeworkCreateRequest request) {
        BalabalaMemberHomework balabalamemberhomework = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamemberhomework.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新学生作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberHomeworkUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到学生作业表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberHomeworkGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberHomeworkGetDetailResponse>(response);
    }

    /**
     * 删除学生作业表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "学生作业表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到学生作业表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "学生作业表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberHomeworkQueryResponse>> getList(@RequestParam(required = false) String homeworkName) {
        SimpleBalabalaMemberHomeworkQueryListRequest request = new SimpleBalabalaMemberHomeworkQueryListRequest();
        if (!StringUtils.isEmpty(homeworkName)) {
            request.setHomeworkName(homeworkName);
        }
        List<SimpleBalabalaMemberHomeworkQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberHomeworkQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String homeworkName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaMemberHomeworkQueryPageRequest request = new SimpleBalabalaMemberHomeworkQueryPageRequest();
        if (!StringUtils.isEmpty(homeworkName)) {
            request.setHomeworkName(homeworkName);
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
        Page<SimpleBalabalaMemberHomeworkQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}