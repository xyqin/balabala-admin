package com.newhead.barablah.modules.barablahmembersignup.ext;

import com.newhead.barablah.modules.barablahclass.BarablahClassStatusEnum;
import com.newhead.barablah.modules.barablahclass.base.repository.dao.BarablahClassMapper;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClass;
import com.newhead.barablah.modules.barablahclass.base.repository.entity.BarablahClassExample;
import com.newhead.barablah.modules.barablahclass.ext.protocol.SimpleBarablahClassQueryResponse;
import com.newhead.barablah.modules.barablahmember.base.repository.dao.BarablahMemberMapper;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMember;
import com.newhead.barablah.modules.barablahmembersignup.base.AbstractBarablahMemberSignupController;
import com.newhead.barablah.modules.barablahmembersignup.ext.protocol.SimpleBarablahMemberSignupCreateRequest;
import com.newhead.barablah.modules.barablahmembersignup.ext.protocol.SimpleBarablahMemberSignupQueryListRequest;
import com.newhead.barablah.modules.barablahmembersignup.ext.protocol.SimpleBarablahMemberSignupQueryResponse;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import com.newhead.rudderframework.core.web.api.ApiValidateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * RudderFramework 自动生成
 * 会员报名表控制
 * 2018年01月18日 06:52:58
 */
@Api(tags = "会员报名表", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmembersignup", method = RequestMethod.GET)
public class SimpleBarablahMemberSignupController extends AbstractBarablahMemberSignupController {
    @Autowired
    private SimpleBarablahMemberSignupService service;

    @Autowired
    private BarablahMemberMapper memberMapper;
    @Autowired
    private BarablahClassMapper classMapper;



    @Override
    public SimpleBarablahMemberSignupService getService() {
        return service;
    }

    /**
     * 得到会员报名表对象
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "获取班级列表", httpMethod = "GET", response = String.class)
    @RequestMapping(value = "getclassofarea/{id}", method = RequestMethod.GET)
    public ApiEntity getClassOfArea(@ApiParam(required = true, name = "id", value = "学员Id") @PathVariable("id") Long id) {
        //根据学员ID获得学员所在校区
        BarablahMember m = memberMapper.selectByPrimaryKey(id);

        //根据校区获得学员可以加入的班级。
        BarablahClassExample e = new BarablahClassExample();
        List<String> list = new ArrayList<>();
        list.add(BarablahClassStatusEnum.待开课.getValue());
        list.add(BarablahClassStatusEnum.已开课.getValue());
        e.createCriteria().andCampusIdEqualTo(m.getCampusId()).andDeletedEqualTo(false).andStatusIn(list);

        List<BarablahClass> classes = classMapper.selectByExample(e);

        List<SimpleBarablahClassQueryResponse> response = new ArrayList<>();
        for(BarablahClass c:classes) {
            SimpleBarablahClassQueryResponse r = new SimpleBarablahClassQueryResponse();
            r.setId(r.getId());
            r.setClassName(r.getClassName());
            response.add(r);
        }
        return new ApiEntity<List<SimpleBarablahClassQueryResponse>>(response);
    }

    @Override
    protected ApiEntity fillCreateRequest(SimpleBarablahMemberSignupCreateRequest request) {
        SimpleBarablahMemberSignupQueryListRequest q = new SimpleBarablahMemberSignupQueryListRequest();
        q.setClassId(request.getClassId());
        q.setMemberId(request.getMemberId());
        List<SimpleBarablahMemberSignupQueryResponse> results = service.queryList(q);
        if (results!=null && results.size()>0) {
            throw new ApiValidateException(ApiStatus.STATUS_400.getCode(),"该学员已经是班级成员！");
        }
        return null;
    }
}
