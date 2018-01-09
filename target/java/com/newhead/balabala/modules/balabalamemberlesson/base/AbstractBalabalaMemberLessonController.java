package com.newhead.balabala.modules.balabalamemberlesson.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamemberlesson.base.repository.entity.BalabalaMemberLesson;
import com.newhead.balabala.modules.balabalamemberlesson.ext.SimpleBalabalaMemberLessonService;
import com.newhead.balabala.modules.balabalamemberlesson.ext.protocol.*;

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
 * 会员课时表控制器
 * 2018年01月09日 04:35:24
 */
@Api(tags = "会员课时表", description = "相关的API")
public abstract class AbstractBalabalaMemberLessonController extends WebController  {

    protected abstract SimpleBalabalaMemberLessonService getService();

    /**
     * 创建会员课时表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberLessonCreateRequest request) {
        BalabalaMemberLesson balabalamemberlesson = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamemberlesson.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员课时表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberLessonUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员课时表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberLessonGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberLessonGetDetailResponse>(response);
    }

    /**
     * 删除会员课时表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员课时表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员课时表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员课时表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberLessonQueryResponse>> getList(@RequestParam(required = false) String type,@RequestParam(required = false) Boolean probational) {
        SimpleBalabalaMemberLessonQueryListRequest request = new SimpleBalabalaMemberLessonQueryListRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        if (!StringUtils.isEmpty(probational)) {
            request.setProbational(probational);
        }
        List<SimpleBalabalaMemberLessonQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberLessonQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String type,
        @RequestParam(required = false) Boolean probational,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaMemberLessonQueryPageRequest request = new SimpleBalabalaMemberLessonQueryPageRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        if (!StringUtils.isEmpty(probational)) {
            request.setProbational(probational);
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
        Page<SimpleBalabalaMemberLessonQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}