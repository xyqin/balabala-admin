package com.newhead.barablah.modules.barablahteacherhomework.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahteacherhomework.base.repository.entity.BarablahTeacherHomework;
import com.newhead.barablah.modules.barablahteacherhomework.ext.SimpleBarablahTeacherHomeworkService;
import com.newhead.barablah.modules.barablahteacherhomework.ext.protocol.*;

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
 * 教师发布作业表控制器
 * 2018年02月07日 04:00:59
 */
@Api(tags = "教师发布作业表", description = "相关的API")
public abstract class AbstractBarablahTeacherHomeworkController extends WebController  {

    protected abstract SimpleBarablahTeacherHomeworkService getService();

    /**
     * 创建教师发布作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahTeacherHomeworkCreateRequest request) {
        BarablahTeacherHomework homeworkName = getService().existByHomeworkName(request.getHomeworkName());
        if (homeworkName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"作业名称'"+request.getHomeworkName()+"'已经存在！");
        }
        BarablahTeacherHomework barablahteacherhomework = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahteacherhomework.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教师发布作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahTeacherHomeworkUpdateRequest request) {
        BarablahTeacherHomework HomeworkName = getService().existByHomeworkName(request.getHomeworkName());
        if (HomeworkName != null && HomeworkName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"作业名称"+request.getHomeworkName()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师发布作业表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahTeacherHomeworkGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahTeacherHomeworkGetDetailResponse>(response);
    }

    /**
     * 删除教师发布作业表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教师发布作业表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教师发布作业表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师发布作业表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTeacherHomeworkQueryResponse>> getList() {
        SimpleBarablahTeacherHomeworkQueryListRequest request = new SimpleBarablahTeacherHomeworkQueryListRequest();
        List<SimpleBarablahTeacherHomeworkQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTeacherHomeworkQueryResponse>>(sources);
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
        SimpleBarablahTeacherHomeworkQueryPageRequest request = new SimpleBarablahTeacherHomeworkQueryPageRequest();
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
        Page<SimpleBarablahTeacherHomeworkQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}