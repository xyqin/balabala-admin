package com.newhead.balabala.modules.balabalatextbookhomework.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalatextbookhomework.base.repository.entity.BalabalaTextbookHomework;
import com.newhead.balabala.modules.balabalatextbookhomework.ext.SimpleBalabalaTextbookHomeworkService;
import com.newhead.balabala.modules.balabalatextbookhomework.ext.protocol.*;

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
 * 教材作业表控制器
 * 2017年12月28日 12:00:30
 */
@Api(tags = "教材作业表", description = "相关的API")
public abstract class AbstractBalabalaTextbookHomeworkController extends WebController  {

    protected abstract SimpleBalabalaTextbookHomeworkService getService();

    /**
     * 创建教材作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaTextbookHomeworkCreateRequest request) {
        BalabalaTextbookHomework homeworkName = getService().existByHomeworkName(request.getHomeworkName());
        if (homeworkName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"作业名称'"+request.getHomeworkName()+"'已经存在！");
        }
        BalabalaTextbookHomework question = getService().existByQuestion(request.getQuestion());
        if (question != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"问题'"+request.getQuestion()+"'已经存在！");
        }
        BalabalaTextbookHomework correct = getService().existByCorrect(request.getCorrect());
        if (correct != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"正确答案'"+request.getCorrect()+"'已经存在！");
        }
        BalabalaTextbookHomework image = getService().existByImage(request.getImage());
        if (image != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"图片'"+request.getImage()+"'已经存在！");
        }
        BalabalaTextbookHomework balabalatextbookhomework = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalatextbookhomework.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教材作业表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaTextbookHomeworkUpdateRequest request) {
        BalabalaTextbookHomework HomeworkName = getService().existByHomeworkName(request.getHomeworkName());
        if (HomeworkName != null && HomeworkName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"作业名称"+request.getHomeworkName()+"'已经存在！");
        }
        BalabalaTextbookHomework Question = getService().existByQuestion(request.getQuestion());
        if (Question != null && Question.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"问题"+request.getQuestion()+"'已经存在！");
        }
        BalabalaTextbookHomework Correct = getService().existByCorrect(request.getCorrect());
        if (Correct != null && Correct.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"正确答案"+request.getCorrect()+"'已经存在！");
        }
        BalabalaTextbookHomework Image = getService().existByImage(request.getImage());
        if (Image != null && Image.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"图片"+request.getImage()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教材作业表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaTextbookHomeworkGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaTextbookHomeworkGetDetailResponse>(response);
    }

    /**
     * 删除教材作业表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教材作业表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教材作业表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教材作业表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaTextbookHomeworkQueryResponse>> getList(@RequestParam(required = false) String type) {
        SimpleBalabalaTextbookHomeworkQueryListRequest request = new SimpleBalabalaTextbookHomeworkQueryListRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        List<SimpleBalabalaTextbookHomeworkQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaTextbookHomeworkQueryResponse>>(sources);
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
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaTextbookHomeworkQueryPageRequest request = new SimpleBalabalaTextbookHomeworkQueryPageRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
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
        Page<SimpleBalabalaTextbookHomeworkQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}