package com.newhead.rudderframework.modules.rudderrole.ext;

import com.newhead.rudderframework.modules.rudderrole.base.AbstractRudderRoleService;
import com.newhead.rudderframework.modules.rudderrole.base.repository.dao.RudderRoleMapper;
import com.newhead.rudderframework.modules.rudderrole.base.repository.entity.RudderRole;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * RudderFramework 自动生成
 * 角色服务
 * 2018年03月18日 02:48:17
 */
@Api(tags = "角色", description = "相关的API")
@Service
public class SimpleRudderRoleService extends AbstractRudderRoleService {

    @Autowired
    private RudderRoleMapper mapper;

    @Override
    protected RudderRoleMapper getMapper() {
        return this.mapper;
    }


    @Override
    protected void saveOrUpdate(RudderRole entity) {

    }
}
