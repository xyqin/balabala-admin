package com.newhead.rudderframework.modules.ruddermenu2permission.ext;

import com.newhead.rudderframework.modules.ruddermenu2permission.base.AbstractRudderMenu2permissionService;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao.RudderMenu2permissionMapper;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 角色权限关系服务
 * 2018年02月07日 10:47:07
 */
@Api(tags = "角色权限关系", description = "相关的API")
@Service
public class SimpleRudderMenu2permissionService extends AbstractRudderMenu2permissionService {

    @Autowired
    private RudderMenu2permissionMapper mapper;

    @Override
    protected RudderMenu2permissionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderMenu2permission entity) {

    }
}
