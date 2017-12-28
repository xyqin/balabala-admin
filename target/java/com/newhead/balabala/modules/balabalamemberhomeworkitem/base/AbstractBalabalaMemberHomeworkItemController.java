package com.newhead.balabala.modules.balabalamemberhomeworkitem.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.base.repository.entity.BalabalaMemberHomeworkItem;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.ext.SimpleBalabalaMemberHomeworkItemService;
import com.newhead.balabala.modules.balabalamemberhomeworkitem.ext.protocol.*;

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
 * 会员作业答案表控制器
 * 2017年12月28日 05:00:58
 */
@Api(tags = "会员作业答案表", description = "相关的API")
public abstract class AbstractBalabalaMemberHomeworkItemController extends WebController  {

    protected abstract SimpleBalabalaMemberHomeworkItemService getService();

    /**
     * 创建会员作业答案表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberHomeworkItemCreateRequest request) {
        BalabalaMemberHomeworkItem answer = getService().existByAnswer(request.getAnswer());
        if (answer != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"答案'"+request.getAnswer()+"'已经存在！");
        }
        BalabalaMemberHomeworkItem balabalamemberhomeworkitem = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamemberhomeworkitem.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员作业答案表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaMemberHomeworkItemUpdateRequest request) {
        BalabalaMemberHomeworkItem Answer = getService().existByAnswer(request.getAnswer());
        if (Answer != null && Answer.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"答案"+request.getAnswer()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员作业答案表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaMemberHomeworkItemGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberHomeworkItemGetDetailResponse>(response);
    }

    /**
     * 删除会员作业答案表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员作业答案表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员作业答案表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员作业答案表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaMemberHomeworkItemQueryResponse>> getList() {
        SimpleBalabalaMemberHomeworkItemQueryListRequest request = new SimpleBalabalaMemberHomeworkItemQueryListRequest();
        List<SimpleBalabalaMemberHomeworkItemQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberHomeworkItemQueryResponse>>(sources);
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
        SimpleBalabalaMemberHomeworkItemQueryPageRequest request = new SimpleBalabalaMemberHomeworkItemQueryPageRequest();
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
        Page<SimpleBalabalaMemberHomeworkItemQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}