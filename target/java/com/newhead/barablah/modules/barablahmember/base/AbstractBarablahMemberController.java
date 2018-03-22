package com.newhead.barablah.modules.barablahmember.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmember.ext.SimpleBarablahMemberService;
import com.newhead.barablah.modules.barablahmember.ext.protocol.*;

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
 * 会员控制器
 * 2018年03月22日 08:05:47
 */
@Api(tags = "会员", description = "相关的API")
public abstract class AbstractBarablahMemberController extends WebController  {

    protected abstract SimpleBarablahMemberService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahMemberCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahMemberUpdateRequest request) {
        return null;
    }
    /**
     * 创建会员
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahMemberCreateRequest request) {
        if (StringUtils.isEmpty(request.getCampusId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getNickname())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"昵称不能为空！");
        }

        if (StringUtils.isEmpty(request.getAvatar())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"头像不能为空！");
        }

        if (StringUtils.isEmpty(request.getEnglishName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"英文名不能为空！");
        }

        if (StringUtils.isEmpty(request.getGender())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"性别不能为空！");
        }

        if (StringUtils.isEmpty(request.getBirthday())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"生日不能为空！");
        }

        if (StringUtils.isEmpty(request.getStatus())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"状态不能为空！");
        }


















        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahMember barablahmember = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahmember.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新会员
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahMemberUpdateRequest request) {

                if (StringUtils.isEmpty(request.getCampusId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getNickname())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"昵称不能为空！");
                }

                if (StringUtils.isEmpty(request.getAvatar())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"头像不能为空！");
                }

                if (StringUtils.isEmpty(request.getEnglishName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"英文名不能为空！");
                }

                if (StringUtils.isEmpty(request.getGender())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"性别不能为空！");
                }

                if (StringUtils.isEmpty(request.getBirthday())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"生日不能为空！");
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
     * 得到会员对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahMemberGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahMemberGetDetailResponse>(response);
    }

    /**
     * 删除会员ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "会员ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到会员列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "会员ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahMemberQueryResponse>> getList(@RequestParam(required = false) Long campusId,@RequestParam(required = false) String nickname,@RequestParam(required = false) String gender,@RequestParam(required = false) String status) {
        SimpleBarablahMemberQueryListRequest request = new SimpleBarablahMemberQueryListRequest();
        if (!StringUtils.isEmpty(campusId)) {
            request.setCampusId(campusId);
        }
        if (!StringUtils.isEmpty(nickname)) {
            request.setNickname(nickname);
        }
        if (!StringUtils.isEmpty(gender)) {
            request.setGender(gender);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        List<SimpleBarablahMemberQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahMemberQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Long campusId,
        @RequestParam(required = false) String nickname,
        @RequestParam(required = false) String gender,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahMemberQueryPageRequest request = new SimpleBarablahMemberQueryPageRequest();
        if (!StringUtils.isEmpty(campusId)) {
            request.setCampusId(campusId);
        }
        if (!StringUtils.isEmpty(nickname)) {
            request.setNickname(nickname);
        }
        if (!StringUtils.isEmpty(gender)) {
            request.setGender(gender);
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
        Page<SimpleBarablahMemberQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}