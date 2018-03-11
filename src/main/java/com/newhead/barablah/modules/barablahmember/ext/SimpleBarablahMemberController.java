package com.newhead.barablah.modules.barablahmember.ext;

import com.barablah.netease.NeteaseClient;
import com.barablah.netease.request.ImUserCreateRequest;
import com.barablah.netease.request.ImUserUpdateRequest;
import com.barablah.netease.response.ImUserCreateResponse;
import com.newhead.barablah.modules.barablahmember.base.AbstractBarablahMemberController;
import com.newhead.barablah.modules.barablahmember.base.repository.entity.BarablahMemberExample;
import com.newhead.barablah.modules.barablahmember.ext.protocol.SimpleBarablahMemberCreateRequest;
import com.newhead.barablah.modules.barablahmember.ext.protocol.SimpleBarablahMemberUpdateBatchRequest;
import com.newhead.rudderframework.core.web.api.ApiEntity;
import com.newhead.rudderframework.core.web.api.ApiStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * RudderFramework 自动生成
 * 会员控制
 * 2018年02月07日 04:55:37
 */
@Api(tags = "会员", description = "相关的API")
@RestController
@RequestMapping(value = "/barablahmember", method = RequestMethod.GET)
public class SimpleBarablahMemberController extends AbstractBarablahMemberController {
    @Autowired
    private SimpleBarablahMemberService service;
    @Autowired
    private NeteaseClient neteaseClient;
    @Override
    public SimpleBarablahMemberService getService() {
        return service;
    }

    @ApiOperation(value = "批量更新会员状态", httpMethod = "POST", response = String.class)
    @RequestMapping(value = "updatebatch", method = RequestMethod.POST)
    public ApiEntity updatebatch(@RequestBody SimpleBarablahMemberUpdateBatchRequest request) {
        getService().updatebatch(request);
        return new ApiEntity<>();
    }

    public ApiEntity fillCreateRequest(SimpleBarablahMemberCreateRequest request) {
        BarablahMemberExample example = new BarablahMemberExample();
        example.createCriteria().andAccidEqualTo("member_" + request.getPhoneNumber());

        List resultList = getService().getMapper().selectByExample(example);
        if (resultList!=null && resultList.size()>0)  {
            return new ApiEntity(ApiStatus.STATUS_400.getCode(),"账号已经存在");
        }

        // 注册网易云IM账号
        ImUserCreateRequest imUserCreateRequest = new ImUserCreateRequest();
        imUserCreateRequest.setAccid("member_" + request.getPhoneNumber());
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
        request.setAccid(imUserCreateResponse.getInfo().getAccid());
        request.setToken(imUserCreateResponse.getInfo().getToken());
        return null;
    }




}
