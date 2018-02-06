package com.newhead.rudderframework.modules.rudderuser.ext;

import com.newhead.rudderframework.modules.rudderuser.base.AbstractRudderUserService;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 用户服务
 * 2018年02月06日 05:24:55
 */
@Api(tags = "用户", description = "相关的API")
@Service
public class SimpleRudderUserService extends AbstractRudderUserService {

    @Autowired
    private RudderUserMapper mapper;

    @Override
    protected RudderUserMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderUser entity) {

    }
}
