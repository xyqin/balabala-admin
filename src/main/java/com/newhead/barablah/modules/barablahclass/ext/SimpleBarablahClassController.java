package com.newhead.barablah.modules.barablahclass.ext;

import com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum;
import com.newhead.barablah.modules.barablahclass.base.AbstractBarablahClassController;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassOpenRequest;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryPageRequest;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryResponse;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiException;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.component.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * RudderFramework 自动生成
 * 开班控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "开班", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahclass", method = RequestMethod.GET)
public class SimpleBarablahClassController extends AbstractBarablahClassController {
    @Autowired
    private SimpleBarablahClassService service;

    @Override
    public SimpleBarablahClassService getService() {
        return service;
    }

    @ApiOperation(value = "开班", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "open", method = RequestMethod.POST)
    public ApiEntity open(@RequestBody SimpleBarablahClassOpenRequest request) {
        if (request.getOnlineLessons() <= 0 && request.getOfflineLessons() <= 0) {
            return new ApiEntity(ApiStatus.STATUS_400.getCode(), "线上或线下课时数必须填写一个合法值");
        }
        try {
            getService().open(request);
        } catch (ApiException ex) {
            return new ApiEntity(ex.getStatusCode(), ex.getStatusMessage());
        }

        return new ApiEntity<>();
    }

    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "获取", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "getcheckpage", method = RequestMethod.GET)
    public ApiEntity getCheckPage(
            @RequestParam(required = false) Long categoryId,
            @RequestParam(required = false) String className,
            @RequestParam(required = false) String monitor,
            @RequestParam(required = false) String monitorPhoneNumber,
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size) {
        SimpleBarablahClassQueryPageRequest request = new SimpleBarablahClassQueryPageRequest();
        if (!StringUtils.isEmpty(categoryId)) {
            request.setCategoryId(categoryId);
        }
        if (!StringUtils.isEmpty(className)) {
            request.setClassName(className);
        }
        if (!StringUtils.isEmpty(monitor)) {
            request.setMonitor(monitor);
        }
        if (!StringUtils.isEmpty(monitorPhoneNumber)) {
            request.setMonitorPhoneNumber(monitorPhoneNumber);
        }
        request.setStatus(BarablahClassStatusEnum.审核中.getValue());
        if (page == null) {
            request.setPage(1);
        } else {
            request.setPage(page);
        }
        if (size == null) {
            request.setPage(10);
        } else {
            request.setSize(size);
        }
        Page<SimpleBarablahClassQueryResponse> sources = getService().queryPage(request);
        return new ApiEntity<>(sources);
    }


    /**
     * 得到翻页数据
     *
     * @return
     */
    @ApiOperation(value = "审核通过或拒绝", response = ApiEntity.class, notes = "")
    @RequestMapping(value = "check", method = RequestMethod.POST)
    public ApiEntity check(
            @RequestParam(required = true) Long classid, @RequestParam(required = true) String status) {
        BarablahClass c = getService().getMapper().selectByPrimaryKey(classid);
        c.setStatus(status);
        getService().getMapper().updateByPrimaryKey(c);
        return new ApiEntity<>();
    }

    @ApiOperation(value = "获取开班课时数量", response = ApiEntity.class, notes = "开班课时ID")
    @RequestMapping(value = "getlessons", method = RequestMethod.GET)
    public ApiEntity<Map<String, Integer>> getLessons(@RequestParam Long id) {
        return new ApiEntity<>(getService().getLessons(id));
    }
}
