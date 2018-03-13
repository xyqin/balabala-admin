package com.newhead.barablah.modules.barablahteacher.ext;

import com.barablah.netease.NeteaseClient;
import com.barablah.netease.request.ImUserCreateRequest;
import com.barablah.netease.request.ImUserUpdateRequest;
import com.barablah.netease.response.ImUserCreateResponse;
import com.newhead.barablah.modules.barablahteacher.BarablahTeacherStatusEnum;
import com.newhead.barablah.modules.barablahteacher.base.AbstractBarablahTeacherController;
import com.newhead.barablah.modules.barablahteacher.base.repository.dao.BarablahTeacherMapper;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacher;
import com.newhead.barablah.modules.barablahteacher.base.repository.entity.BarablahTeacherExample;
import com.newhead.barablah.modules.barablahteacher.ext.protocol.*;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
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
    @Autowired
    private NeteaseClient neteaseClient;
    @Autowired
    private BarablahTeacherMapper mapper;
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
    public ApiEntity<List<SimpleBarablahTeacherQueryResponse>> getListbyarea(@RequestParam(required = false) long area) {

        BarablahTeacherExample example = new BarablahTeacherExample();
        example.createCriteria().andCampusIdEqualTo(area);
        List<BarablahTeacher> results = mapper.selectByExample(example);
        List<SimpleBarablahTeacherQueryResponse> sources = new ArrayList<>();

        convertEntityToResponse(results,sources);
        return new ApiEntity<List<SimpleBarablahTeacherQueryResponse>>(sources);
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

    protected ApiEntity fillCreateRequest(SimpleBarablahTeacherCreateRequest request) {
        BarablahTeacherExample example = new BarablahTeacherExample();
        example.createCriteria().andAccidEqualTo("teacher_" + request.getPhoneNumber());

        List resultList = getService().getMapper().selectByExample(example);
        if (resultList!=null && resultList.size()>0)  {
            return new ApiEntity(ApiStatus.STATUS_400.getCode(),"账号已经存在");
        }

        // 注册网易云IM账号
        ImUserCreateRequest imUserCreateRequest = new ImUserCreateRequest();
        imUserCreateRequest.setAccid("teacher_" + request.getPhoneNumber());
        ImUserCreateResponse imUserCreateResponse = null;
        try {
            imUserCreateResponse = neteaseClient.execute(imUserCreateRequest);
        } catch (IOException e) {
            return new ApiEntity(ApiStatus.STATUS_500.getCode(),"调用网易云注册IM账号失败");
        }

        if (!imUserCreateResponse.isSuccess()) {
            ImUserUpdateRequest updateRequest = new ImUserUpdateRequest();
            updateRequest.setAccid("teacher_" + request.getPhoneNumber());
            try {
                //return new ApiEntity(ApiStatus.STATUS_400.getCode(), "注册网易云账号失败,手机号已注册过");
                imUserCreateResponse = neteaseClient.execute(updateRequest);
            } catch (IOException e) {
                return new ApiEntity(ApiStatus.STATUS_500.getCode(),"调用网易云注册IM账号失败");
            }
        }

        request.setStatus(BarablahTeacherStatusEnum.启用.getValue());

        request.setPassword(DigestUtils.md5Hex(request.getPassword()));

        request.setAccid(imUserCreateResponse.getInfo().getAccid());
        request.setToken(imUserCreateResponse.getInfo().getToken());
        return null;
    }

    @Override
    protected ApiEntity fillUpdateRequest(SimpleBarablahTeacherUpdateRequest request) {
        if (request.getPassword()!=null) {
            SimpleBarablahTeacherGetDetailResponse response =  getService().getDetail(request.getId());
            if (response.getPassword()!=null && !response.getPassword().equals(request.getPassword())) {
                request.setPassword(DigestUtils.md5Hex(request.getPassword()));
            }
        }
        return super.fillUpdateRequest(request);
    }

    /**
     * 对象转换
     * @param entitys
     * @param results
     */
    private void convertEntityToResponse(List<BarablahTeacher> entitys,List<SimpleBarablahTeacherQueryResponse> results) {
        //第一组
        for(BarablahTeacher entity:entitys) {
            SimpleBarablahTeacherQueryResponse response = new SimpleBarablahTeacherQueryResponse();
            BeanUtils.copyProperties(entity,response);
            results.add(response);
        }
    }
}
