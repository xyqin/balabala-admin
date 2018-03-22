package com.newhead.rudderframework.modules.ruddermenu2permission.ext;

import com.newhead.rudderframework.modules.ruddermenu2permission.base.AbstractRudderMenu2permissionService;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.dao.RudderMenu2permissionMapper;
import com.newhead.rudderframework.modules.ruddermenu2permission.base.repository.entity.RudderMenu2permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Api;
/**
 * RudderFramework 自动生成
 * 菜单权限关系服务
 * 2018年03月22日 08:05:42
 */
@Api(tags = "菜单权限关系", description = "相关的API")
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
