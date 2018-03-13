package com.newhead.barablah.modules.barablahmemberpassport.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmemberpassport.base.repository.entity.BarablahMemberPassport;
import com.newhead.barablah.modules.barablahmemberpassport.ext.SimpleBarablahMemberPassportService;
import com.newhead.barablah.modules.barablahmemberpassport.ext.protocol.*;

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
 * 会员通行证控制器
 * 2018年03月13日 12:41:35
 */
@Api(tags = "会员通行证", description = "相关的API")
public abstract class AbstractBarablahMemberPassportController extends WebController  {

    protected abstract SimpleBarablahMemberPassportService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahMemberPassportCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahMemberPassportUpdateRequest request) {
        return null;
    }
    /**
     * 创建会员通行证
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberPassportCreateRequest request) {
        if (StringUtils.isEmpty(request.getMemberId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getProvider())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"帐号来源不能为空！");
        }

        if (StringUtils.isEmpty(request.getProviderId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"帐号授权ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getPassword())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"密码不能为空！");
        }


        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahMemberPassport barablahmemberpassport = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmemberpassport.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员通行证
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahMemberPassportUpdateRequest request) {

                if (StringUtils.isEmpty(request.getMemberId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"会员ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getProvider())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"帐号来源不能为空！");
                }

                if (StringUtils.isEmpty(request.getProviderId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"帐号授权ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getPassword())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"密码不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员通行证对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahMemberPassportGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberPassportGetDetailResponse>(response);
    }

    /**
     * 删除会员通行证ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员通行证ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员通行证列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员通行证ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahMemberPassportQueryResponse>> getList() {
        SimpleBarablahMemberPassportQueryListRequest request = new SimpleBarablahMemberPassportQueryListRequest();
        List<SimpleBarablahMemberPassportQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberPassportQueryResponse>>(sources);
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
        SimpleBarablahMemberPassportQueryPageRequest request = new SimpleBarablahMemberPassportQueryPageRequest();
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
        Page<SimpleBarablahMemberPassportQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}