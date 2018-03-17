package com.newhead.rudderframework.modules.rudderrole2permission.ext;

import com.newhead.rudderframework.modules.rudderrole2permission.base.AbstractRudderRole2permissionService;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.dao.RudderRole2permissionMapper;
import com.newhead.rudderframework.modules.rudderrole2permission.base.repository.entity.RudderRole2permission;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 角色权限关系服务
 * 2018年03月18日 02:48:17
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
