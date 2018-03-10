package com.newhead.barablah.modules.barablahteacher.ext;

import com.newhead.barablah.modules.barablahteacher.BarablahTeacherStatusEnum;
import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherController;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.*;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RudderFramework 自动生成
 * 教师控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "教师", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahteacher", method = RequestMethod.GET)
public class SimpleBarablahTeacherController extends AbstractBarablahTeacherController {
    @Autowired
    private SimpleBarablahTeacherService service;

    @Override
    public SimpleBarablahTeacherService getService() {
        return service;
    }

    @ApiOperation(value = "批量更新教师状态", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatebatch", method = RequestMethod.POST)
    public ApiEntity updatebatch(@RequestBody SimpleBarablahTeacherUpdateBatchRequest request) {
        getService().updatebatch(request);
        return new ApiEntity<>();
    }

    /**
     * 得到教师列表
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "教师ID")
    @RequestMapping(value = "getlistbyarea", method = RequestMethod.GET)
    public ApiEntity<List<SimpleBarablahTeacherQueryResponse>> getList(@RequestParam(required = false) long area) {
        SimpleBarablahTeacherQueryListRequest request = new SimpleBarablahTeacherQueryListRequest();
        request.setArea(area);
        List<SimpleBarablahTeacherQueryResponse> sources = getService().queryList(request);
        return new ApiEntity<List<SimpleBarablahTeacherQueryResponse>>(sources);
    }


    /**
     * 更新教师
     *
     * @param request
     * @return
     */
    @ApiOperation(value = "更新", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ApiEntity update(@RequestBody SimpleBarablahTeacherUpdateRequest request) {
        if (request.getPassword()==null||request.getPassword().trim().equals("")) {
           request.setPassword(DigestUtils.md5Hex(request.getPassword()));
        }
        getService().update(request);
        return new ApiEntity<>();
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getcheckpage", method = RequestMethod.GET)
    public ApiEntity getPage(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String fullName,
            @RequestParam(required = false) String phoneNumber,
            @RequestParam(required = false) String major,
            @RequestParam(required = false) String comeFrom,
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size) {
        SimpleBarablahTeacherQueryPageRequest request = new SimpleBarablahTeacherQueryPageRequest();
        if (!StringUtils.isEmpty(username)) {
            request.setUsername(username);
        }
        if (!StringUtils.isEmpty(fullName)) {
            request.setFullName(fullName);
        }
        if (!StringUtils.isEmpty(phoneNumber)) {
            request.setPhoneNumber(phoneNumber);
        }
        if (!StringUtils.isEmpty(major)) {
            request.setMajor(major);
        }
        if (!StringUtils.isEmpty(comeFrom)) {
            request.setComeFrom(comeFrom);
        }
        request.setStatus(BarablahTeacherStatusEnum.待审核.getValue());
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
        Page<SimpleBarablahTeacherQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }
}
