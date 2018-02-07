package com.newhead.barablah.modules.barablahmemberhomework.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmemberhomework.base.repository.entity.BarablahMemberHomework;
import com.newhead.barablah.modules.barablahmemberhomework.ext.SimpleBarablahMemberHomeworkService;
import com.newhead.barablah.modules.barablahmemberhomework.ext.protocol.*;

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
 * 2018年02月07日 04:00:59
 */
@Api(tags = "学生作业表", description = "相关的API")
public abstract class AbstractBarablahMemberHomeworkController extends WebController  {

    protected abstract SimpleBarablahMemberHomeworkService getService();

    /**
     * 创建学生作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberHomeworkCreateRequest request) {
        BarablahMemberHomework barablahmemberhomework = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmemberhomework.getId());
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
    public ApiEntity update(@RequestBody SimpleBarablahMemberHomeworkUpdateRequest request) {
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
        SimpleBarablahMemberHomeworkGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberHomeworkGetDetailResponse>(response);
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
    public ApiEntity<List<SimpleBarablahMemberHomeworkQueryResponse>> getList(@RequestParam(required = false) String homeworkName,@RequestParam(required = false) String status) {
        SimpleBarablahMemberHomeworkQueryListRequest request = new SimpleBarablahMemberHomeworkQueryListRequest();
        if (!StringUtils.isEmpty(homeworkName)) {
            request.setHomeworkName(homeworkName);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        List<SimpleBarablahMemberHomeworkQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberHomeworkQueryResponse>>(sources);
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
        @RequestParam(required = false) String status,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahMemberHomeworkQueryPageRequest request = new SimpleBarablahMemberHomeworkQueryPageRequest();
        if (!StringUtils.isEmpty(homeworkName)) {
            request.setHomeworkName(homeworkName);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
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
        Page<SimpleBarablahMemberHomeworkQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}