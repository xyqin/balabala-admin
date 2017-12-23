package com.newhead.balabala.modules.balabalateacher.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalateacher.base.repository.entity.BalabalaTeacher;
import com.newhead.balabala.modules.balabalateacher.ext.SimpleBalabalaTeacherService;
import com.newhead.balabala.modules.balabalateacher.ext.protocol.*;

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
 * 教师控制器
 * 2017年12月23日 02:12:59
 */
@Api(tags = "教师", description = "相关的API")
public abstract class AbstractBalabalaTeacherController extends WebController  {

    protected abstract SimpleBalabalaTeacherService getService();

    /**
     * 创建教师
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaTeacherCreateRequest request) {
        BalabalaTeacher balabalateacher = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalateacher.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教师
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaTeacherUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaTeacherGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaTeacherGetDetailResponse>(response);
    }

    /**
     * 删除教师ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教师ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教师列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaTeacherQueryResponse>> getList(@RequestParam(required = false) String username,@RequestParam(required = false) String password,@RequestParam(required = false) String avatar,@RequestParam(required = false) String fullName,@RequestParam(required = false) String phoneNumber,@RequestParam(required = false) String major,@RequestParam(required = false) String comeFrom,@RequestParam(required = false) String status,@RequestParam(required = false) String accid,@RequestParam(required = false) String token) {
        SimpleBalabalaTeacherQueryListRequest request = new SimpleBalabalaTeacherQueryListRequest();
        if (!StringUtils.isEmpty(username)) {
            request.setUsername(username);
        }
        if (!StringUtils.isEmpty(password)) {
            request.setPassword(password);
        }
        if (!StringUtils.isEmpty(avatar)) {
            request.setAvatar(avatar);
        }
        if (!StringUtils.isEmpty(fullName)) {
            request.setFullName(fullName);
        }
        if (!StringUtils.isEmpty(phoneNumber)) {
            request.setPhoneNumber(phoneNumber);
        }
        if (!StringUtils.isEmpty(major)) {
            request.setMajor(major);
        }
        if (!StringUtils.isEmpty(comeFrom)) {
            request.setComeFrom(comeFrom);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        if (!StringUtils.isEmpty(accid)) {
            request.setAccid(accid);
        }
        if (!StringUtils.isEmpty(token)) {
            request.setToken(token);
        }
        List<SimpleBalabalaTeacherQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaTeacherQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String username,
        @RequestParam(required = false) String password,
        @RequestParam(required = false) String avatar,
        @RequestParam(required = false) String fullName,
        @RequestParam(required = false) String phoneNumber,
        @RequestParam(required = false) String major,
        @RequestParam(required = false) String comeFrom,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String accid,
        @RequestParam(required = false) String token,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaTeacherQueryPageRequest request = new SimpleBalabalaTeacherQueryPageRequest();
        if (!StringUtils.isEmpty(username)) {
            request.setUsername(username);
        }
        if (!StringUtils.isEmpty(password)) {
            request.setPassword(password);
        }
        if (!StringUtils.isEmpty(avatar)) {
            request.setAvatar(avatar);
        }
        if (!StringUtils.isEmpty(fullName)) {
            request.setFullName(fullName);
        }
        if (!StringUtils.isEmpty(phoneNumber)) {
            request.setPhoneNumber(phoneNumber);
        }
        if (!StringUtils.isEmpty(major)) {
            request.setMajor(major);
        }
        if (!StringUtils.isEmpty(comeFrom)) {
            request.setComeFrom(comeFrom);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        if (!StringUtils.isEmpty(accid)) {
            request.setAccid(accid);
        }
        if (!StringUtils.isEmpty(token)) {
            request.setToken(token);
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
        Page<SimpleBalabalaTeacherQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}