package com.newhead.rudderframework.modules.rudderuser.ext;

import com.newhead.rudderframework.modules.rudderuser.base.AbstractRudderUserService;
import com.newhead.rudderframework.modules.rudderuser.base.repository.dao.RudderUserMapper;
import com.newhead.rudderframework.modules.rudderuser.base.repository.entity.RudderUser;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 用户服务
 * 2018年03月18日 05:08:24
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
