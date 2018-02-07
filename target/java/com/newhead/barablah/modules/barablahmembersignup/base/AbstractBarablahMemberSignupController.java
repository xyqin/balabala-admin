package com.newhead.barablah.modules.barablahmembersignup.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.entity.BarablahMemberSignup;
import com.newhead.barablah.modules.barablahmembersignup.ext.SimpleBarablahMemberSignupService;
import com.newhead.barablah.modules.barablahmembersignup.ext.protocol.*;

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
 * 会员报名表控制器
 * 2018年02月07日 04:00:59
 */
@Api(tags = "会员报名表", description = "相关的API")
public abstract class AbstractBarablahMemberSignupController extends WebController  {

    protected abstract SimpleBarablahMemberSignupService getService();

    /**
     * 创建会员报名表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberSignupCreateRequest request) {
        BarablahMemberSignup barablahmembersignup = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmembersignup.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员报名表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahMemberSignupUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到会员报名表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahMemberSignupGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberSignupGetDetailResponse>(response);
    }

    /**
     * 删除会员报名表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员报名表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员报名表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员报名表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahMemberSignupQueryResponse>> getList(@RequestParam(required = false) String payment) {
        SimpleBarablahMemberSignupQueryListRequest request = new SimpleBarablahMemberSignupQueryListRequest();
        if (!StringUtils.isEmpty(payment)) {
            request.setPayment(payment);
        }
        List<SimpleBarablahMemberSignupQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberSignupQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String payment,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahMemberSignupQueryPageRequest request = new SimpleBarablahMemberSignupQueryPageRequest();
        if (!StringUtils.isEmpty(payment)) {
            request.setPayment(payment);
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
        Page<SimpleBarablahMemberSignupQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}