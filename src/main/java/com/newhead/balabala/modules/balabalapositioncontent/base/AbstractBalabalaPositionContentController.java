package com.newhead.balabala.modules.balabalapositioncontent.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.balabala.modules.balabalapositioncontent.base.repository.entity.BalabalaPositionContent;
import com.newhead.balabala.modules.balabalapositioncontent.ext.SimpleBalabalaPositionContentService;
import com.newhead.balabala.modules.balabalapositioncontent.ext.protocol.*;

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
 * 位置内容表控制器
 * 2018年01月09日 04:35:24
 */
@Api(tags = "位置内容表", description = "相关的API")
public abstract class AbstractBalabalaPositionContentController extends WebController  {

    protected abstract SimpleBalabalaPositionContentService getService();

    /**
     * 创建位置内容表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBalabalaPositionContentCreateRequest request) {
        BalabalaPositionContent balabalapositioncontent = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", balabalapositioncontent.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新位置内容表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBalabalaPositionContentUpdateRequest request) {
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到位置内容表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBalabalaPositionContentGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBalabalaPositionContentGetDetailResponse>(response);
    }

    /**
     * 删除位置内容表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "位置内容表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到位置内容表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "位置内容表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBalabalaPositionContentQueryResponse>> getList(@RequestParam(required = false) String contentName,@RequestParam(required = false) String image,@RequestParam(required = false) String link) {
        SimpleBalabalaPositionContentQueryListRequest request = new SimpleBalabalaPositionContentQueryListRequest();
        if (!StringUtils.isEmpty(contentName)) {
            request.setContentName(contentName);
        }
        if (!StringUtils.isEmpty(image)) {
            request.setImage(image);
        }
        if (!StringUtils.isEmpty(link)) {
            request.setLink(link);
        }
        List<SimpleBalabalaPositionContentQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBalabalaPositionContentQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) String contentName,
        @RequestParam(required = false) String image,
        @RequestParam(required = false) String link,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBalabalaPositionContentQueryPageRequest request = new SimpleBalabalaPositionContentQueryPageRequest();
        if (!StringUtils.isEmpty(contentName)) {
            request.setContentName(contentName);
        }
        if (!StringUtils.isEmpty(image)) {
            request.setImage(image);
        }
        if (!StringUtils.isEmpty(link)) {
            request.setLink(link);
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
        Page<SimpleBalabalaPositionContentQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}