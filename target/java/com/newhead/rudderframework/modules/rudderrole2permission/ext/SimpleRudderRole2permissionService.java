package com.newhead.rudderframework.modules.rudderrole2permission.ext;

import com.newhead.rudderframework.modules.rudderrole2permission.base.AbstractRudderRole2permissionService;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 角色权限关系服务
 * 2017年12月28日 01:55:48
 */
@Api(tags = "角色权限关系", description = "相关的API")
@Service
public class SimpleRudderRole2permissionService extends AbstractRudderRole2permissionService {

    @Autowired
    private RudderRole2permissionMapper mapper;

    @Override
    protected RudderRole2permissionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderRole2permission entity) {

    }
}
