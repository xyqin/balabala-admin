package com.newhead.barablah.modules.barablahteacherhomeworkitem.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.base.repository.entity.BarablahTeacherHomeworkItem;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.ext.SimpleBarablahTeacherHomeworkItemService;
import com.newhead.barablah.modules.barablahteacherhomeworkitem.ext.protocol.*;

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
 * 教师发布作业题目表控制器
 * 2018年03月24日 04:29:02
 */
@Api(tags = "教师发布作业题目表", description = "相关的API")
public abstract class AbstractBarablahTeacherHomeworkItemController extends WebController  {

    protected abstract SimpleBarablahTeacherHomeworkItemService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahTeacherHomeworkItemCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahTeacherHomeworkItemUpdateRequest request) {
        return null;
    }
    /**
     * 创建教师发布作业题目表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahTeacherHomeworkItemCreateRequest request) {
        if (StringUtils.isEmpty(request.getTeacherId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教师ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getHomeworkId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教师发布作业ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getTextbookId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"题目ID不能为空！");
        }











        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahTeacherHomeworkItem barablahteacherhomeworkitem = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahteacherhomeworkitem.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新教师发布作业题目表
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahTeacherHomeworkItemUpdateRequest request) {

                if (StringUtils.isEmpty(request.getTeacherId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教师ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getHomeworkId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"教师发布作业ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getTextbookId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"题目ID不能为空！");
                }



       ApiEntity entity = fillUpdateRequest(request);
        if (entity!=null) {
            return entity;
        }
        getService().update(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师发布作业题目表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahTeacherHomeworkItemGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahTeacherHomeworkItemGetDetailResponse>(response);
    }

    /**
     * 删除教师发布作业题目表ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "教师发布作业题目表ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到教师发布作业题目表列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师发布作业题目表ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTeacherHomeworkItemQueryResponse>> getList() {
        SimpleBarablahTeacherHomeworkItemQueryListRequest request = new SimpleBarablahTeacherHomeworkItemQueryListRequest();
        List<SimpleBarablahTeacherHomeworkItemQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTeacherHomeworkItemQueryResponse>>(sources);
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
        SimpleBarablahTeacherHomeworkItemQueryPageRequest request = new SimpleBarablahTeacherHomeworkItemQueryPageRequest();
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
        Page<SimpleBarablahTeacherHomeworkItemQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}