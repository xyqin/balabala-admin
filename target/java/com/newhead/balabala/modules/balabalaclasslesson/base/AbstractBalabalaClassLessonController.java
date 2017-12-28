package com.newhead.balabala.modules.balabalaclasslesson.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalaclasslesson.base.repository.entity.BalabalaClassLesson;
import com.newhead.balabala.modules.balabalaclasslesson.ext.SimpleBalabalaClassLessonService;
import com.newhead.balabala.modules.balabalaclasslesson.ext.protocol.*;

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
 * 开班课时控制器
 * 2017年12月28日 01:55:50
 */
@Api(tags = "开班课时", description = "相关的API")
public abstract class AbstractBalabalaClassLessonController extends WebController  {

    protected abstract SimpleBalabalaClassLessonService getService();

    /**
     * 创建开班课时
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaClassLessonCreateRequest request) {
        BalabalaClassLesson balabalaclasslesson = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalaclasslesson.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新开班课时
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaClassLessonUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到开班课时对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaClassLessonGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaClassLessonGetDetailResponse>(response);
    }

    /**
     * 删除开班课时ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "开班课时ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到开班课时列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "开班课时ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaClassLessonQueryResponse>> getList(@RequestParam(required = false) String lessonName,@RequestParam(required = false) String thumbnail,@RequestParam(required = false) String video,@RequestParam(required = false) String room) {
        SimpleBalabalaClassLessonQueryListRequest request = new SimpleBalabalaClassLessonQueryListRequest();
        if (!StringUtils.isEmpty(lessonName)) {
            request.setLessonName(lessonName);
        }
        if (!StringUtils.isEmpty(thumbnail)) {
            request.setThumbnail(thumbnail);
        }
        if (!StringUtils.isEmpty(video)) {
            request.setVideo(video);
        }
        if (!StringUtils.isEmpty(room)) {
            request.setRoom(room);
        }
        List<SimpleBalabalaClassLessonQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaClassLessonQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String lessonName,
        @RequestParam(required = false) String thumbnail,
        @RequestParam(required = false) String video,
        @RequestParam(required = false) String room,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaClassLessonQueryPageRequest request = new SimpleBalabalaClassLessonQueryPageRequest();
        if (!StringUtils.isEmpty(lessonName)) {
            request.setLessonName(lessonName);
        }
        if (!StringUtils.isEmpty(thumbnail)) {
            request.setThumbnail(thumbnail);
        }
        if (!StringUtils.isEmpty(video)) {
            request.setVideo(video);
        }
        if (!StringUtils.isEmpty(room)) {
            request.setRoom(room);
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
        Page<SimpleBalabalaClassLessonQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}