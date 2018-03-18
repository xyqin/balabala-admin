package com.newhead.barablah.modules.barablahmemberlesson.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmemberlesson.base.repository.entity.BarablahMemberLesson;
import com.newhead.barablah.modules.barablahmemberlesson.ext.SimpleBarablahMemberLessonService;
import com.newhead.barablah.modules.barablahmemberlesson.ext.protocol.*;

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
 * 2018年03月18日 05:08:32
 */
@Api(tags = "会员课时表", description = "相关的API")
public abstract class AbstractBarablahMemberLessonController extends WebController  {

    protected abstract SimpleBarablahMemberLessonService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahMemberLessonCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahMemberLessonUpdateRequest request) {
        return null;
    }
    /**
     * 创建会员课时表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberLessonCreateRequest request) {
        if (StringUtils.isEmpty(request.getMemberId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getClassId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getLessonId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课时ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getType())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"类型不能为空！");
        }

        if (StringUtils.isEmpty(request.getProbational())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否试听不能为空！");
        }















        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahMemberLesson barablahmemberlesson = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmemberlesson.getId());
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
    public ApiEntity update(@RequestBody SimpleBarablahMemberLessonUpdateRequest request) {

                if (StringUtils.isEmpty(request.getMemberId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getClassId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getLessonId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课时ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getType())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"类型不能为空！");
                }

                if (StringUtils.isEmpty(request.getProbational())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否试听不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
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
        SimpleBarablahMemberLessonGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberLessonGetDetailResponse>(response);
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
    public ApiEntity<List<SimpleBarablahMemberLessonQueryResponse>> getList(@RequestParam(required = false) String type,@RequestParam(required = false) Boolean probational) {
        SimpleBarablahMemberLessonQueryListRequest request = new SimpleBarablahMemberLessonQueryListRequest();
        if (!StringUtils.isEmpty(type)) {
            request.setType(type);
        }
        if (!StringUtils.isEmpty(probational)) {
            request.setProbational(probational);
        }
        List<SimpleBarablahMemberLessonQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberLessonQueryResponse>>(sources);
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
        SimpleBarablahMemberLessonQueryPageRequest request = new SimpleBarablahMemberLessonQueryPageRequest();
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
        Page<SimpleBarablahMemberLessonQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}