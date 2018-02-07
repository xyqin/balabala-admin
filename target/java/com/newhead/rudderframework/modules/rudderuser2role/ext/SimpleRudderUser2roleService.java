package com.newhead.rudderframework.modules.rudderuser2role.ext;

import com.newhead.rudderframework.modules.rudderuser2role.base.AbstractRudderUser2roleService;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.dao.RudderUser2roleMapper;
import com.newhead.rudderframework.modules.rudderuser2role.base.repository.entity.RudderUser2role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 用户角色关系服务
 * 2018年02月07日 10:47:07
 */
@Api(tags = "用户角色关系", description = "相关的API")
@Service
public class SimpleRudderUser2roleService extends AbstractRudderUser2roleService {

    @Autowired
    private RudderUser2roleMapper mapper;

    @Override
    protected RudderUser2roleMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderUser2role entity) {

    }
}
