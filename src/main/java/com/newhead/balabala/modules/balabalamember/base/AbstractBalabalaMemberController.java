package com.newhead.balabala.modules.balabalamember.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalamember.base.repository.entity.BalabalaMember;
import com.newhead.balabala.modules.balabalamember.ext.SimpleBalabalaMemberService;
import com.newhead.balabala.modules.balabalamember.ext.protocol.*;

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
 * 2017年12月23日 02:12:59
 */
@Api(tags = "会员", description = "相关的API")
public abstract class AbstractBalabalaMemberController extends WebController  {

    protected abstract SimpleBalabalaMemberService getService();

    /**
     * 创建会员
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaMemberCreateRequest request) {
        BalabalaMember balabalamember = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalamember.getId());
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
    public ApiEntity update(@RequestBody SimpleBalabalaMemberUpdateRequest request) {
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
        SimpleBalabalaMemberGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaMemberGetDetailResponse>(response);
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
    public ApiEntity<List<SimpleBalabalaMemberQueryResponse>> getList(@RequestParam(required = false) String nickname,@RequestParam(required = false) String avatar,@RequestParam(required = false) String englishName,@RequestParam(required = false) String gender,@RequestParam(required = false) String birthday,@RequestParam(required = false) String accid,@RequestParam(required = false) String token) {
        SimpleBalabalaMemberQueryListRequest request = new SimpleBalabalaMemberQueryListRequest();
        if (!StringUtils.isEmpty(nickname)) {
            request.setNickname(nickname);
        }
        if (!StringUtils.isEmpty(avatar)) {
            request.setAvatar(avatar);
        }
        if (!StringUtils.isEmpty(englishName)) {
            request.setEnglishName(englishName);
        }
        if (!StringUtils.isEmpty(gender)) {
            request.setGender(gender);
        }
        if (!StringUtils.isEmpty(birthday)) {
            request.setBirthday(birthday);
        }
        if (!StringUtils.isEmpty(accid)) {
            request.setAccid(accid);
        }
        if (!StringUtils.isEmpty(token)) {
            request.setToken(token);
        }
        List<SimpleBalabalaMemberQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaMemberQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String nickname,
        @RequestParam(required = false) String avatar,
        @RequestParam(required = false) String englishName,
        @RequestParam(required = false) String gender,
        @RequestParam(required = false) String birthday,
        @RequestParam(required = false) String accid,
        @RequestParam(required = false) String token,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaMemberQueryPageRequest request = new SimpleBalabalaMemberQueryPageRequest();
        if (!StringUtils.isEmpty(nickname)) {
            request.setNickname(nickname);
        }
        if (!StringUtils.isEmpty(avatar)) {
            request.setAvatar(avatar);
        }
        if (!StringUtils.isEmpty(englishName)) {
            request.setEnglishName(englishName);
        }
        if (!StringUtils.isEmpty(gender)) {
            request.setGender(gender);
        }
        if (!StringUtils.isEmpty(birthday)) {
            request.setBirthday(birthday);
        }
        if (!StringUtils.isEmpty(accid)) {
            request.setAccid(accid);
        }
        if (!StringUtils.isEmpty(token)) {
            request.setToken(token);
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
        Page<SimpleBalabalaMemberQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}