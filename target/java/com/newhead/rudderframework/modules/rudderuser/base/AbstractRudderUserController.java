package com.newhead.rudderframework.modules.rudderuser.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.rudderframework.modules.LabelValueItem;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import com.newhead.rudderframework.modules.rudderuser.ext.SimpleRudderUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * RudderFramework 自动生成
 * 用户控制器
 * 2018年03月18日 02:48:25
 */
@Api(tags = "用户", description = "相关的API")
public abstract class AbstractRudderUserController extends WebController  {

    protected abstract SimpleRudderUserService getService();
    protected ApiEntity fillCreateRequest(SimpleRudderUserCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleRudderUserUpdateRequest request) {
        return null;
    }
    /**
     * 创建用户
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleRudderUserCreateRequest request) {
        if (StringUtils.isEmpty(request.getRudderuserName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"账号名称不能为空！");
        }

        if (StringUtils.isEmpty(request.getRudderuserDesc())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"备注不能为空！");
        }

        if (StringUtils.isEmpty(request.getPassword())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"密码不能为空！");
        }

        if (StringUtils.isEmpty(request.getStatus())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"用户状态不能为空！");
        }

        if (StringUtils.isEmpty(request.getNickname())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"昵称不能为空！");
        }

        if (StringUtils.isEmpty(request.getEmail())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"email不能为空！");
        }

        if (StringUtils.isEmpty(request.getVisible())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否显示不能为空！");
        }

        if (StringUtils.isEmpty(request.getCampusId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
        }


        if(request.getRudderuserName()!=null) {
            RudderUser rudderuserName = getService().existByRudderuserName(request.getRudderuserName());
            if (rudderuserName != null) {
                throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"账号名称'"+request.getRudderuserName()+"'已经存在！");
            }
        }















        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        RudderUser rudderuser = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", rudderuser.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新用户
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleRudderUserUpdateRequest request) {

                if (StringUtils.isEmpty(request.getRudderuserName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"账号名称不能为空！");
                }

                if (StringUtils.isEmpty(request.getRudderuserDesc())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"备注不能为空！");
                }

                if (StringUtils.isEmpty(request.getPassword())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"密码不能为空！");
                }

                if (StringUtils.isEmpty(request.getStatus())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"用户状态不能为空！");
                }

                if (StringUtils.isEmpty(request.getNickname())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"昵称不能为空！");
                }

                if (StringUtils.isEmpty(request.getEmail())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"email不能为空！");
                }

                if (StringUtils.isEmpty(request.getVisible())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"是否显示不能为空！");
                }

                if (StringUtils.isEmpty(request.getCampusId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
                }


    if(request.getRudderuserName()!=null) {

        RudderUser RudderuserName = getService().existByRudderuserName(request.getRudderuserName());
        if (RudderuserName != null && RudderuserName.getId()!=request.getId()) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"账号名称"+request.getRudderuserName()+"'已经存在！");
        }
    }


       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到用户对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleRudderUserGetDetailResponse response =  getService().getDetail(id);
        List<LabelValueItem> items = getService().getRudderRoles(id);
        response.setRudderRoleItems(items);
        return new ApiEntity<SimpleRudderUserGetDetailResponse>(response);
    }

    /**
     * 删除用户ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "用户ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到用户列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "用户ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleRudderUserQueryResponse>> getList(@RequestParam(required = false) String rudderuserName,@RequestParam(required = false) String status) {
        SimpleRudderUserQueryListRequest request = new SimpleRudderUserQueryListRequest();
        if (!StringUtils.isEmpty(rudderuserName)) {
            request.setRudderuserName(rudderuserName);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        List<SimpleRudderUserQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleRudderUserQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String rudderuserName,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleRudderUserQueryPageRequest request = new SimpleRudderUserQueryPageRequest();
        if (!StringUtils.isEmpty(rudderuserName)) {
            request.setRudderuserName(rudderuserName);
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
        Page<SimpleRudderUserQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}