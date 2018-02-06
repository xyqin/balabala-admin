package com.newhead.barablah.modules.barablahtextbook.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahtextbook.base.repository.entity.BarablahTextbook;
import com.newhead.barablah.modules.barablahtextbook.ext.SimpleBarablahTextbookService;
import com.newhead.barablah.modules.barablahtextbook.ext.protocol.*;

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
 * 教材表控制器
 * 2018年02月06日 02:51:00
 */
@Api(tags = "教材表", description = "相关的API")
public abstract class AbstractBarablahTextbookController extends WebController  {

    protected abstract SimpleBarablahTextbookService getService();

    /**
     * 创建教材表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahTextbookCreateRequest request) {
        BarablahTextbook textbookName = getService().existByTextbookName(request.getTextbookName());
        if (textbookName != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"题目名称'"+request.getTextbookName()+"'已经存在！");
        }
        BarablahTextbook question = getService().existByQuestion(request.getQuestion());
        if (question != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"问题'"+request.getQuestion()+"'已经存在！");
        }
        BarablahTextbook option = getService().existByOption(request.getOption());
        if (option != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"选项'"+request.getOption()+"'已经存在！");
        }
        BarablahTextbook correct = getService().existByCorrect(request.getCorrect());
        if (correct != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"正确答案'"+request.getCorrect()+"'已经存在！");
        }
        BarablahTextbook image = getService().existByImage(request.getImage());
        if (image != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"图片'"+request.getImage()+"'已经存在！");
        }
        BarablahTextbook video = getService().existByVideo(request.getVideo());
        if (video != null) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"音频'"+request.getVideo()+"'已经存在！");
        }
        BarablahTextbook barablahtextbook = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahtextbook.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教材表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahTextbookUpdateRequest request) {
        BarablahTextbook TextbookName = getService().existByTextbookName(request.getTextbookName());
        if (TextbookName != null && TextbookName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"题目名称"+request.getTextbookName()+"'已经存在！");
        }
        BarablahTextbook Question = getService().existByQuestion(request.getQuestion());
        if (Question != null && Question.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"问题"+request.getQuestion()+"'已经存在！");
        }
        BarablahTextbook Option = getService().existByOption(request.getOption());
        if (Option != null && Option.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"选项"+request.getOption()+"'已经存在！");
        }
        BarablahTextbook Correct = getService().existByCorrect(request.getCorrect());
        if (Correct != null && Correct.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"正确答案"+request.getCorrect()+"'已经存在！");
        }
        BarablahTextbook Image = getService().existByImage(request.getImage());
        if (Image != null && Image.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"图片"+request.getImage()+"'已经存在！");
        }
        BarablahTextbook Video = getService().existByVideo(request.getVideo());
        if (Video != null && Video.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"音频"+request.getVideo()+"'已经存在！");
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教材表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahTextbookGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahTextbookGetDetailResponse>(response);
    }

    /**
     * 删除教材表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教材表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教材表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教材表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTextbookQueryResponse>> getList(@RequestParam(required = false) Long categoryId,@RequestParam(required = false) String type,@RequestParam(required = false) String textbookName) {
        SimpleBarablahTextbookQueryListRequest request = new SimpleBarablahTextbookQueryListRequest();
        if (!StringUtils.isEmpty(categoryId)) {
            request.setCategoryId(categoryId);
        }
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        if (!StringUtils.isEmpty(textbookName)) {
            request.setTextbookName(textbookName);
        }
        List<SimpleBarablahTextbookQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTextbookQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Long categoryId,
        @RequestParam(required = false) String type,
        @RequestParam(required = false) String textbookName,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahTextbookQueryPageRequest request = new SimpleBarablahTextbookQueryPageRequest();
        if (!StringUtils.isEmpty(categoryId)) {
            request.setCategoryId(categoryId);
        }
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        if (!StringUtils.isEmpty(textbookName)) {
            request.setTextbookName(textbookName);
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
        Page<SimpleBarablahTextbookQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}