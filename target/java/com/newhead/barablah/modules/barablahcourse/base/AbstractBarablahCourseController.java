package com.newhead.barablah.modules.barablahcourse.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahcourse.base.repository.entity.BarablahCourse;
import com.newhead.barablah.modules.barablahcourse.ext.SimpleBarablahCourseService;
import com.newhead.barablah.modules.barablahcourse.ext.protocol.*;

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
 * 课程控制器
 * 2018年01月26日 03:39:50
 */
@Api(tags = "课程", description = "相关的API")
public abstract class AbstractBarablahCourseController extends WebController  {

    protected abstract SimpleBarablahCourseService getService();

    /**
     * 创建课程
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahCourseCreateRequest request) {
        BarablahCourse barablahcourse = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahcourse.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新课程
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahCourseUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到课程对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahCourseGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahCourseGetDetailResponse>(response);
    }

    /**
     * 删除课程ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "课程ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到课程列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "课程ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahCourseQueryResponse>> getList(@RequestParam(required = false) String courseName) {
        SimpleBarablahCourseQueryListRequest request = new SimpleBarablahCourseQueryListRequest();
        if (!StringUtils.isEmpty(courseName)) {
            request.setCourseName(courseName);
        }
        List<SimpleBarablahCourseQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahCourseQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String courseName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahCourseQueryPageRequest request = new SimpleBarablahCourseQueryPageRequest();
        if (!StringUtils.isEmpty(courseName)) {
            request.setCourseName(courseName);
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
        Page<SimpleBarablahCourseQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}