package com.newhead.barablah.modules.barablahteachermajor.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahteachermajor.base.repository.entity.BarablahTeacherMajor;
import com.newhead.barablah.modules.barablahteachermajor.ext.SimpleBarablahTeacherMajorService;
import com.newhead.barablah.modules.barablahteachermajor.ext.protocol.*;

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
 * 教师专业控制器
 * 2018年03月25日 10:55:23
 */
@Api(tags = "教师专业", description = "相关的API")
public abstract class AbstractBarablahTeacherMajorController extends WebController  {

    protected abstract SimpleBarablahTeacherMajorService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahTeacherMajorCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahTeacherMajorUpdateRequest request) {
        return null;
    }
    /**
     * 创建教师专业
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahTeacherMajorCreateRequest request) {
        if (StringUtils.isEmpty(request.getMajorName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"专业名称不能为空！");
        }


        if(request.getMajorName()!=null) {
            BarablahTeacherMajor majorName = getService().existByMajorName(request.getMajorName());
            if (majorName != null) {
                throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"专业名称'"+request.getMajorName()+"'已经存在！");
            }
        }








        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahTeacherMajor barablahteachermajor = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahteachermajor.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教师专业
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahTeacherMajorUpdateRequest request) {

                if (StringUtils.isEmpty(request.getMajorName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"专业名称不能为空！");
                }


    if(request.getMajorName()!=null) {

        BarablahTeacherMajor MajorName = getService().existByMajorName(request.getMajorName());
        if (MajorName != null && MajorName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"专业名称"+request.getMajorName()+"'已经存在！");
        }
    }


       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师专业对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahTeacherMajorGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahTeacherMajorGetDetailResponse>(response);
    }

    /**
     * 删除教师专业ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教师专业ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教师专业列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师专业ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTeacherMajorQueryResponse>> getList(@RequestParam(required = false) String majorName) {
        SimpleBarablahTeacherMajorQueryListRequest request = new SimpleBarablahTeacherMajorQueryListRequest();
        if (!StringUtils.isEmpty(majorName)) {
            request.setMajorName(majorName);
        }
        List<SimpleBarablahTeacherMajorQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTeacherMajorQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String majorName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahTeacherMajorQueryPageRequest request = new SimpleBarablahTeacherMajorQueryPageRequest();
        if (!StringUtils.isEmpty(majorName)) {
            request.setMajorName(majorName);
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
        Page<SimpleBarablahTeacherMajorQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}