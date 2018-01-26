package com.newhead.barablah.modules.barablahmembercomment.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmembercomment.base.repository.entity.BarablahMemberComment;
import com.newhead.barablah.modules.barablahmembercomment.ext.SimpleBarablahMemberCommentService;
import com.newhead.barablah.modules.barablahmembercomment.ext.protocol.*;

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
 * 2018年01月26日 11:59:32
 */
@Api(tags = "教师评语表", description = "相关的API")
public abstract class AbstractBarablahMemberCommentController extends WebController  {

    protected abstract SimpleBarablahMemberCommentService getService();

    /**
     * 创建教师评语表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberCommentCreateRequest request) {
        BarablahMemberComment barablahmembercomment = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmembercomment.getId());
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
    public ApiEntity update(@RequestBody SimpleBarablahMemberCommentUpdateRequest request) {
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
        SimpleBarablahMemberCommentGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberCommentGetDetailResponse>(response);
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
    public ApiEntity<List<SimpleBarablahMemberCommentQueryResponse>> getList(@RequestParam(required = false) String content) {
        SimpleBarablahMemberCommentQueryListRequest request = new SimpleBarablahMemberCommentQueryListRequest();
        if (!StringUtils.isEmpty(content)) {
            request.setContent(content);
        }
        List<SimpleBarablahMemberCommentQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberCommentQueryResponse>>(sources);
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
        SimpleBarablahMemberCommentQueryPageRequest request = new SimpleBarablahMemberCommentQueryPageRequest();
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
        Page<SimpleBarablahMemberCommentQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}