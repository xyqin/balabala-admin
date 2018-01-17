package com.newhead.balabala.modules.balabalamembercomment.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamembercomment.base.repository.entity.BalabalaMemberComment;
import com.newhead.balabala.modules.balabalamembercomment.ext.SimpleBalabalaMemberCommentService;
import com.newhead.balabala.modules.balabalamembercomment.ext.protocol.*;

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
 * 教师评语表控制器
 * 2018年01月17日 05:42:36
 */
@Api(tags = "教师评语表", description = "相关的API")
public abstract class AbstractBalabalaMemberCommentController extends WebController  {

    protected abstract SimpleBalabalaMemberCommentService getService();

    /**
     * 创建教师评语表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberCommentCreateRequest request) {
        BalabalaMemberComment balabalamembercomment = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamembercomment.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教师评语表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberCommentUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师评语表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberCommentGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberCommentGetDetailResponse>(response);
    }

    /**
     * 删除教师评语表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教师评语表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教师评语表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师评语表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberCommentQueryResponse>> getList(@RequestParam(required = false) String content) {
        SimpleBalabalaMemberCommentQueryListRequest request = new SimpleBalabalaMemberCommentQueryListRequest();
        if (!StringUtils.isEmpty(content)) {
            request.setContent(content);
        }
        List<SimpleBalabalaMemberCommentQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberCommentQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String content,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaMemberCommentQueryPageRequest request = new SimpleBalabalaMemberCommentQueryPageRequest();
        if (!StringUtils.isEmpty(content)) {
            request.setContent(content);
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
        Page<SimpleBalabalaMemberCommentQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}