package com.newhead.barablah.modules.barablahmembersignup.ext;

import com.newhead.barablah.modules.barablahmembersignup.base.AbstractBarablahMemberSignupService;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.dao.BarablahMemberSignupMapper;
import com.newhead.barablah.modules.barablahmembersignup.base.repository.entity.BarablahMemberSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 会员报名表服务
 * 2018年02月06日 05:24:55
 */
@Api(tags = "会员报名表", description = "相关的API")
@Service
public class SimpleBarablahMemberSignupService extends AbstractBarablahMemberSignupService {

    @Autowired
    private BarablahMemberSignupMapper mapper;

    @Override
    protected BarablahMemberSignupMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(BarablahMemberSignup entity) {

    }
}
