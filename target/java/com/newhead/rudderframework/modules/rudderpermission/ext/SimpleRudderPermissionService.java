package com.newhead.rudderframework.modules.rudderpermission.ext;

import com.newhead.rudderframework.modules.rudderpermission.base.AbstractRudderPermissionService;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.dao.RudderPermissionMapper;
import com.newhead.rudderframework.modules.rudderpermission.base.repository.entity.RudderPermission;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 权限服务
 * 2018年03月18日 02:48:17
 */
@Api(tags = "权限", description = "相关的API")
@Service
public class SimpleRudderPermissionService extends AbstractRudderPermissionService {

    @Autowired
    private RudderPermissionMapper mapper;

    @Override
    protected RudderPermissionMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderPermission entity) {

    }
}
