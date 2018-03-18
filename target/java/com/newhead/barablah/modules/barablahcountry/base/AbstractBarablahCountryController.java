package com.newhead.barablah.modules.barablahcountry.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahcountry.base.repository.entity.BarablahCountry;
import com.newhead.barablah.modules.barablahcountry.ext.SimpleBarablahCountryService;
import com.newhead.barablah.modules.barablahcountry.ext.protocol.*;

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
 * 国籍设置控制器
 * 2018年03月18日 05:08:33
 */
@Api(tags = "国籍设置", description = "相关的API")
public abstract class AbstractBarablahCountryController extends WebController  {

    protected abstract SimpleBarablahCountryService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahCountryCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahCountryUpdateRequest request) {
        return null;
    }
    /**
     * 创建国籍设置
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahCountryCreateRequest request) {
        if (StringUtils.isEmpty(request.getName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"英文名称不能为空！");
        }

        if (StringUtils.isEmpty(request.getZhName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"中文名称不能为空！");
        }

        if (StringUtils.isEmpty(request.getCode())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"缩写不能为空！");
        }

        if (StringUtils.isEmpty(request.getCode2())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"编码不能为空！");
        }












        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahCountry barablahcountry = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahcountry.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新国籍设置
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahCountryUpdateRequest request) {

                if (StringUtils.isEmpty(request.getName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"英文名称不能为空！");
                }

                if (StringUtils.isEmpty(request.getZhName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"中文名称不能为空！");
                }

                if (StringUtils.isEmpty(request.getCode())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"缩写不能为空！");
                }

                if (StringUtils.isEmpty(request.getCode2())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"编码不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到国籍设置对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahCountryGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahCountryGetDetailResponse>(response);
    }

    /**
     * 删除国籍设置ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "国籍设置ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到国籍设置列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "国籍设置ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahCountryQueryResponse>> getList(@RequestParam(required = false) String name,@RequestParam(required = false) String zhName,@RequestParam(required = false) String code,@RequestParam(required = false) String code2) {
        SimpleBarablahCountryQueryListRequest request = new SimpleBarablahCountryQueryListRequest();
        if (!StringUtils.isEmpty(name)) {
            request.setName(name);
        }
        if (!StringUtils.isEmpty(zhName)) {
            request.setZhName(zhName);
        }
        if (!StringUtils.isEmpty(code)) {
            request.setCode(code);
        }
        if (!StringUtils.isEmpty(code2)) {
            request.setCode2(code2);
        }
        List<SimpleBarablahCountryQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahCountryQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String zhName,
        @RequestParam(required = false) String code,
        @RequestParam(required = false) String code2,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahCountryQueryPageRequest request = new SimpleBarablahCountryQueryPageRequest();
        if (!StringUtils.isEmpty(name)) {
            request.setName(name);
        }
        if (!StringUtils.isEmpty(zhName)) {
            request.setZhName(zhName);
        }
        if (!StringUtils.isEmpty(code)) {
            request.setCode(code);
        }
        if (!StringUtils.isEmpty(code2)) {
            request.setCode2(code2);
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
        Page<SimpleBarablahCountryQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}