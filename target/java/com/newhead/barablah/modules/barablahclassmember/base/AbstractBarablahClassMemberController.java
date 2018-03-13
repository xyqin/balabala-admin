package com.newhead.barablah.modules.barablahclassmember.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahclassmember.base.repository.entity.BarablahClassMember;
import com.newhead.barablah.modules.barablahclassmember.ext.SimpleBarablahClassMemberService;
import com.newhead.barablah.modules.barablahclassmember.ext.protocol.*;

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
 * 开班会员控制器
 * 2018年03月13日 12:41:35
 */
@Api(tags = "开班会员", description = "相关的API")
public abstract class AbstractBarablahClassMemberController extends WebController  {

    protected abstract SimpleBarablahClassMemberService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahClassMemberCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahClassMemberUpdateRequest request) {
        return null;
    }
    /**
     * 创建开班会员
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahClassMemberCreateRequest request) {
        if (StringUtils.isEmpty(request.getClassId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getMemberId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getStatus())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"状态不能为空！");
        }


        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahClassMember barablahclassmember = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahclassmember.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新开班会员
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahClassMemberUpdateRequest request) {

                if (StringUtils.isEmpty(request.getClassId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"开班ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getMemberId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getStatus())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"状态不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到开班会员对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahClassMemberGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahClassMemberGetDetailResponse>(response);
    }

    /**
     * 删除开班会员ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "开班会员ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到开班会员列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "开班会员ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahClassMemberQueryResponse>> getList(@RequestParam(required = false) Long classId,@RequestParam(required = false) Long memberId,@RequestParam(required = false) String status) {
        SimpleBarablahClassMemberQueryListRequest request = new SimpleBarablahClassMemberQueryListRequest();
        if (!StringUtils.isEmpty(classId)) {
            request.setClassId(classId);
        }
        if (!StringUtils.isEmpty(memberId)) {
            request.setMemberId(memberId);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        List<SimpleBarablahClassMemberQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahClassMemberQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Long classId,
        @RequestParam(required = false) Long memberId,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahClassMemberQueryPageRequest request = new SimpleBarablahClassMemberQueryPageRequest();
        if (!StringUtils.isEmpty(classId)) {
            request.setClassId(classId);
        }
        if (!StringUtils.isEmpty(memberId)) {
            request.setMemberId(memberId);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
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
        Page<SimpleBarablahClassMemberQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}