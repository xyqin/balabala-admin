package com.newhead.barablah.modules.barablahmemberlessonlog.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmemberlessonlog.base.repository.entity.BarablahMemberLessonlog;
import com.newhead.barablah.modules.barablahmemberlessonlog.ext.SimpleBarablahMemberLessonlogService;
import com.newhead.barablah.modules.barablahmemberlessonlog.ext.protocol.*;

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
 * 学员课时活动记录控制器
 * 2018年03月24日 01:24:57
 */
@Api(tags = "学员课时活动记录", description = "相关的API")
public abstract class AbstractBarablahMemberLessonlogController extends WebController  {

    protected abstract SimpleBarablahMemberLessonlogService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahMemberLessonlogCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahMemberLessonlogUpdateRequest request) {
        return null;
    }
    /**
     * 创建学员课时活动记录
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberLessonlogCreateRequest request) {
        if (StringUtils.isEmpty(request.getClassId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getLessonId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课时ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getMemberId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getAction())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"类型不能为空！");
        }















        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahMemberLessonlog barablahmemberlessonlog = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmemberlessonlog.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新学员课时活动记录
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahMemberLessonlogUpdateRequest request) {

                if (StringUtils.isEmpty(request.getClassId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getLessonId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课时ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getMemberId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getAction())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"类型不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到学员课时活动记录对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahMemberLessonlogGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberLessonlogGetDetailResponse>(response);
    }

    /**
     * 删除学员课时活动记录ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "学员课时活动记录ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到学员课时活动记录列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "学员课时活动记录ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahMemberLessonlogQueryResponse>> getList(@RequestParam(required = false) String action) {
        SimpleBarablahMemberLessonlogQueryListRequest request = new SimpleBarablahMemberLessonlogQueryListRequest();
        if (!StringUtils.isEmpty(action)) {
            request.setAction(action);
        }
        List<SimpleBarablahMemberLessonlogQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberLessonlogQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String action,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahMemberLessonlogQueryPageRequest request = new SimpleBarablahMemberLessonlogQueryPageRequest();
        if (!StringUtils.isEmpty(action)) {
            request.setAction(action);
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
        Page<SimpleBarablahMemberLessonlogQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}