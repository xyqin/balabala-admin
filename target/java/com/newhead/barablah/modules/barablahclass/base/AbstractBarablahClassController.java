package com.newhead.barablah.modules.barablahclass.base;

import com.google.common.collect.Maps;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import com.newhead.rudderframework.core.web.component.tree.Tree;
import com.newhead.rudderframework.modules.LabelValueItem;


import com.newhead.rudderframework.core.web.controller.WebController;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.ext.SimpleBarablahClassService;
import com.newhead.barablah.modules.barablahclass.ext.protocol.*;

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
 * 开班控制器
 * 2018年03月24日 04:29:02
 */
@Api(tags = "开班", description = "相关的API")
public abstract class AbstractBarablahClassController extends WebController  {

    protected abstract SimpleBarablahClassService getService();
    protected ApiEntity fillCreateRequest(SimpleBarablahClassCreateRequest request) {
        return null;
    }

    protected ApiEntity fillUpdateRequest(SimpleBarablahClassUpdateRequest request) {
        return null;
    }
    /**
     * 创建开班
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "创建", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public ApiEntity<Map> create(@RequestBody SimpleBarablahClassCreateRequest request) {
        if (StringUtils.isEmpty(request.getCategoryId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"班级分类ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getCampusId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getTeacherId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"线上教师不能为空！");
        }

        if (StringUtils.isEmpty(request.getCourseCatId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课程分类不能为空！");
        }

        if (StringUtils.isEmpty(request.getCourseId())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课程ID不能为空！");
        }

        if (StringUtils.isEmpty(request.getClassName())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"班级名称不能为空！");
        }

        if (StringUtils.isEmpty(request.getStatus())) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"状态不能为空！");
        }


















        ApiEntity entity = fillCreateRequest(request);
        if (entity!=null) {
            return entity;
        }

        BarablahClass barablahclass = getService().create(request);
        //默认创建成功返回ID
        Map<String, Long> result = Maps.newHashMap();
        result.put("id", barablahclass.getId());
        return new ApiEntity<>(result);
    }

    /**
     * 更新开班
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahClassUpdateRequest request) {

                if (StringUtils.isEmpty(request.getCategoryId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"班级分类ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getCampusId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"校区ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getTeacherId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"线上教师不能为空！");
                }

                if (StringUtils.isEmpty(request.getCourseCatId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课程分类不能为空！");
                }

                if (StringUtils.isEmpty(request.getCourseId())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"课程ID不能为空！");
                }

                if (StringUtils.isEmpty(request.getClassName())) {
                    throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"班级名称不能为空！");
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
     * 得到开班对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取详情", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getdetail/{id}", method = RequestMethod.GET)
    public ApiEntity getDetail(@ApiParam(required = true, name = "id", value = "菜单ID") @PathVariable("id") Long id) {
        SimpleBarablahClassGetDetailResponse response =  getService().getDetail(id);
        return new ApiEntity<SimpleBarablahClassGetDetailResponse>(response);
    }

    /**
     * 删除开班ID
     *
     * @param id
     */
    @ApiOperation(value = "删除", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public ApiEntity delete(@ApiParam(required = true, name = "id", value = "开班ID") @PathVariable("id") Long id) {
        getService().delete(id);
        return new ApiEntity<>();
    }

    /**
     * 得到开班列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "开班ID")
    @RequestMapping(value = "getlist", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahClassQueryResponse>> getList(@RequestParam(required = false) Long categoryId,@RequestParam(required = false) Long campusId,@RequestParam(required = false) Long teacherId,@RequestParam(required = false) Long courseId,@RequestParam(required = false) String className,@RequestParam(required = false) String status) {
        SimpleBarablahClassQueryListRequest request = new SimpleBarablahClassQueryListRequest();
        if (!StringUtils.isEmpty(categoryId)) {
            request.setCategoryId(categoryId);
        }
        if (!StringUtils.isEmpty(campusId)) {
            request.setCampusId(campusId);
        }
        if (!StringUtils.isEmpty(teacherId)) {
            request.setTeacherId(teacherId);
        }
        if (!StringUtils.isEmpty(courseId)) {
            request.setCourseId(courseId);
        }
        if (!StringUtils.isEmpty(className)) {
            request.setClassName(className);
        }
        if (!StringUtils.isEmpty(status)) {
            request.setStatus(status);
        }
        List<SimpleBarablahClassQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahClassQueryResponse>>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getpage", method = RequestMethod.GET)
    public ApiEntity getPage(
        @RequestParam(required = false) Long categoryId,
        @RequestParam(required = false) Long campusId,
        @RequestParam(required = false) Long teacherId,
        @RequestParam(required = false) Long courseId,
        @RequestParam(required = false) String className,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) Integer page,
        @RequestParam(required = false) Integer size) {
        SimpleBarablahClassQueryPageRequest request = new SimpleBarablahClassQueryPageRequest();
        if (!StringUtils.isEmpty(categoryId)) {
            request.setCategoryId(categoryId);
        }
        if (!StringUtils.isEmpty(campusId)) {
            request.setCampusId(campusId);
        }
        if (!StringUtils.isEmpty(teacherId)) {
            request.setTeacherId(teacherId);
        }
        if (!StringUtils.isEmpty(courseId)) {
            request.setCourseId(courseId);
        }
        if (!StringUtils.isEmpty(className)) {
            request.setClassName(className);
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
        Page<SimpleBarablahClassQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }

}